/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeems;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
      JTextField tfusername, tfpassword ;
      JButton previous;
    Login()
    {
       getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 30);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 30);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 30);
        add(lblpassword);
        
        tfpassword = new JTextField();
        tfpassword.setBounds(150, 70, 150, 30);
        add(tfpassword);
        
        JButton login = new JButton("LOGIN");
        login.setBounds(150, 140, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
//        JButton previous = new JButton("Go Back");
//        previous.setBounds(150, 200, 150 , 30);
//        previous.setBackground(Color.BLACK);
//        previous.setForeground(Color.WHITE);
//        previous.addActionListener(this);
//        add(previous);

        previous = new JButton("Go Back");
        previous.setBounds(150, 200, 150, 30);
        previous.setBackground(Color.BLACK);
        previous.setForeground(Color.WHITE);
        previous.addActionListener(this);
        add(previous);
        
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        
         setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == previous)
        {
            setVisible(false);
            new Splash();
        }
       if(ae.getSource() != previous){ 
        try {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            Conn c = new Conn();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";
            
            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Home();
            }else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       }
    }
    
    public static void main(String str[])
    {
        new Login();
    }
}
