import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.GridLayout;


public class RegistarationPage extends JFrame{
    public static void main(String [] args){
        RegistarationPage rg = new RegistarationPage();
        rg.setVisible(true);
        rg.setSize(500,500);
        rg.setTitle("Registration Page");

    }

        JLabel name, address, gender, hobbies;
        JTextField tfname, taddress;
        JRadioButton rbmale, rbfemale;
        ButtonGroup bg;
        JCheckBox c, cpp, java, python;
        JButton registration, reset;
        JPanel jp1, jp2, jp3, jp4, mp;

        RegistarationPage(){
            mp = new JPanel();
            mp.setLayout(new GridLayout(4,1));

            jp1 = new JPanel();
            jp1.setLayout(new GridLayout(2,2));
            name = new JLabel("Name");
            address = new JLabel("Address");
            tfname = new JTextField();
            taddress = new JTextField();
            jp1.add(name);
            jp1.add(tfname);
            jp1.add(address);
            jp1.add(taddress);
            mp.add(jp1);

            jp2 = new JPanel();
            jp2.setLayout(new GridLayout(1,3));
            gender = new JLabel("Gender");
            rbmale = new JRadioButton("Male");
            rbfemale = new JRadioButton("Female");
            bg = new ButtonGroup();
            bg.add(rbmale);
            bg.add(rbfemale);
            jp2.add(gender);
            jp2.add(gender);
            jp2.add(rbmale);
            jp2.add(rbfemale);
            mp.add(jp2);

            jp3 = new JPanel();
            jp3.setLayout(new GridLayout(1,5));
            hobbies = new JLabel("Hobbies");
            c = new JCheckBox("C");
            cpp = new JCheckBox("CPP");
            java = new JCheckBox("Java");
            python = new JCheckBox("Python");
            jp3.add(hobbies);
            jp3.add(c);
            jp3.add(cpp);
            jp3.add(java);
            jp3.add(python);
            mp.add(jp3);

            jp4 = new JPanel();
            jp4.setLayout(new GridLayout(1,2));
            registration = new JButton("Registration");
            reset = new JButton("Reset");
            jp4.add(registration);
            jp4.add(reset);
            mp.add(jp4);

            add(mp);

        }

    
}
