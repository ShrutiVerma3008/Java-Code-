import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;

// Database configuration for connection
class DatabaseConfig {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String USER = "root";
    private static final String PASS = "Abhinav258963";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}

// Product class with basic attributes
class Product {
    private String sku;
    private String name;
    private String category;
    private int quantity;
    private double price;

    public Product(String sku, String name, String category, int quantity, double price) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public String getSku() { return sku; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "SKU: " + sku + ", Name: " + name + ", Category: " + category + ", Quantity: " + quantity + ", Price: $" + price;
    }
}

// Inventory class for managing products
class Inventory {
    private Map<String, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getSku(), product);
    }

    public Product getProduct(String sku) {
        return products.get(sku);
    }

    public void updateProductQuantity(String sku, int quantity) {
        Product product = products.get(sku);
        if (product != null) {
            product.setQuantity(quantity);
            System.out.println("Updated quantity for SKU " + sku + " to " + quantity);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayAllProducts(JTextArea displayArea) {
        if (products.isEmpty()) {
            displayArea.append("No products in inventory.\n");
        } else {
            displayArea.append("=== Inventory List ===\n");
            for (Product product : products.values()) {
                displayArea.append(product + "\n");
            }
        }
    }
}

// Order class to handle product orders
class Order {
    private String orderId;
    private Map<String, Integer> orderItems; // SKU to quantity
    private String status;

    public Order(String orderId, Map<String, Integer> orderItems) {
        this.orderId = orderId;
        this.orderItems = orderItems;
        this.status = "Pending";
    }

    public void processOrder(Inventory inventory, JTextArea displayArea) {
        boolean orderFulfilled = true;
        for (String sku : orderItems.keySet()) {
            int orderedQuantity = orderItems.get(sku);
            Product product = inventory.getProduct(sku);
            if (product != null && product.getQuantity() >= orderedQuantity) {
                inventory.updateProductQuantity(sku, product.getQuantity() - orderedQuantity);
            } else {
                displayArea.append("Insufficient stock for SKU " + sku + " or product does not exist.\n");
                orderFulfilled = false;
            }
        }
        this.status = orderFulfilled ? "Shipped" : "Pending";
        displayArea.append("Order Status: " + status + "\n");
    }
}

// GUI and main functionality class
public class InventoryManagementGUI extends JFrame {
    private static Inventory inventory = new Inventory();

    // Components for the GUI
    private JTextField skuField, nameField, categoryField, quantityField, priceField;
    private JTextArea displayArea;
    private JButton addButton, viewButton, updateButton, orderButton;

    public InventoryManagementGUI() {
        setTitle("Inventory Management System");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel for product details input
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.setBorder(BorderFactory.createTitledBorder("Product Details"));

        skuField = new JTextField();
        nameField = new JTextField();
        categoryField = new JTextField();
        quantityField = new JTextField();
        priceField = new JTextField();

        inputPanel.add(new JLabel("SKU:"));
        inputPanel.add(skuField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Category:"));
        inputPanel.add(categoryField);
        inputPanel.add(new JLabel("Quantity:"));
        inputPanel.add(quantityField);
        inputPanel.add(new JLabel("Price:"));
        inputPanel.add(priceField);

        // Panel for action buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        addButton = new JButton("Add Product");
        viewButton = new JButton("View All Products");
        updateButton = new JButton("Update Quantity");
        orderButton = new JButton("Place Order");

        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(orderButton);

        // Area to display inventory information
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);

        // Add panels to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(scrollPane, BorderLayout.SOUTH);

        // Event listeners
        addButton.addActionListener(e -> addProduct());
        viewButton.addActionListener(e -> displayAllProducts());
        updateButton.addActionListener(e -> updateProductQuantity());
        orderButton.addActionListener(e -> placeOrder());
    }

    // Method to add a new product
    private void addProduct() {
        String sku = skuField.getText();
        String name = nameField.getText();
        String category = categoryField.getText();
        int quantity = Integer.parseInt(quantityField.getText());
        double price = Double.parseDouble(priceField.getText());

        Product product = new Product(sku, name, category, quantity, price);
        inventory.addProduct(product);
        displayArea.append("Product added: " + product + "\n");
        clearFields();
    }

    // Method to display all products
    private void displayAllProducts() {
        displayArea.setText("");
        inventory.displayAllProducts(displayArea);
    }

    // Method to update product quantity
    private void updateProductQuantity() {
        String sku = JOptionPane.showInputDialog("Enter SKU to update quantity:");
        int newQuantity = Integer.parseInt(JOptionPane.showInputDialog("Enter new quantity:"));

        inventory.updateProductQuantity(sku, newQuantity);
        displayArea.append("Updated quantity for SKU " + sku + " to " + newQuantity + "\n");
    }

    // Method to place an order
    private void placeOrder() {
        String orderId = JOptionPane.showInputDialog("Enter Order ID:");
        Map<String, Integer> orderItems = new HashMap<>();

        while (true) {
            String sku = JOptionPane.showInputDialog("Enter Product SKU (or type 'done' to finish):");
            if (sku.equalsIgnoreCase("done")) {
                break;
            }
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter Quantity:"));
            orderItems.put(sku, quantity);
        }

        Order order = new Order(orderId, orderItems);
        order.processOrder(inventory, displayArea);
    }

    // Method to clear text fields after adding a product
    private void clearFields() {
        skuField.setText("");
        nameField.setText("");
        categoryField.setText("");
        quantityField.setText("");
        priceField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InventoryManagementGUI gui = new InventoryManagementGUI();
            gui.setVisible(true);
        });
    }
}
