package employeems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

    JButton view, add, update1, remove , previous;
    
    Home() {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(heading);
        
        add = new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        image.add(add);
        
        view = new JButton("View Employees");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        image.add(view);
        
        update1 = new JButton("Update Employee");
        update1.setBounds(650, 140, 150, 40);
        update1.addActionListener(this);
        image.add(update1);
        
        remove = new JButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener(this);
        image.add(remove);
        
        previous = new JButton("Go Back");
        previous.setBounds(740, 200, 150, 40);
        previous.addActionListener(this);
        image.add(previous);
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } 
        else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        }
        else if (ae.getSource() == update1) {
            setVisible(false);
            new ViewEmployee();
        } 
        else {
            setVisible(false);
            new RemoveEmployee();
        }
        if(ae.getSource() == previous)
        {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
