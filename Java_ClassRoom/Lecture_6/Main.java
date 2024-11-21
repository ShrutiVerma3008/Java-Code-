import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    public static void main(String[] args)
    {
        Main jfd = new Main();
        jfd.setVisible(true);
        jfd.setTitle("Abhinav's Frame");
        jfd.setSize(400,420);  //default 0 0 
        jfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    JButton addition, sub;
    JTextArea jta, jtb,result;

    public Main(){
        setLayout(new FlowLayout());
        addition = new JButton("Add");
        sub = new JButton("Sub");
        jta = new JTextArea("A : ");  //text area has width and height while field only has width
        jtb = new JTextArea(("B: "));
        result = new JTextArea(("result"));
        jta.setSize(10,10);
        jtb.setSize(10,10);
        result.setSize(10,10);

        add(addition);
        add(sub);
        add(jta);
        add(jtb);
        add(result);
        addition.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(addition.isEnabled()){
            int a = Integer.parseInt(jta.getText());
            int b = Integer.parseInt(jtb.getText());

            int sum = a+b;
            result.setText(sum+ " ");

        }

    }
}