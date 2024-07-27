package employeems;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener{
    Splash()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGMENT SYSTEM");
        heading.setBounds(170, 30, 1000, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 40));
        heading.setForeground(Color.BLUE);
        add(heading);//for adding componet in the frame;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1300, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 880, 500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(360, 450, 200, 50);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);
         
        setSize(1000 , 650); //setSize(length , width)
        setLocation(450,200); //setLocation(left , top);
        setVisible(true); //bydefault frame is hidden.
        
//        while(true) {
//            heading.setVisible(false);
//            try {
//                Thread.sleep(0);
//            } catch (Exception e){
//                
//            }
//            
//            heading.setVisible(true);
//            try {
//                Thread.sleep(0);
//            } catch (Exception e){
//                
//            }
//        } 
    }
     public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    public static void main(String str[])
    {
        new Splash();
    }
}
