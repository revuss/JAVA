/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitalcl;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Digitalcl extends JFrame {
//    JLabel label1;
//    
//    public Digitalcl()
//    {
//      label1 = new JLabel("");
//      setLayout(new FlowLayout());
//      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      add (label1);
//      setSize(720,120);
//      setLocationRelativeTo(null);
//      setVisible(true);
//    }

    JLabel label1;
    Clock ct;
    
    
    
    public Digitalcl()
    {
     label1 = new JLabel("");
     setLayout(new FlowLayout());
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     label1.setFont(new Font("Arial",Font.CENTER_BASELINE,45));
     label1.setOpaque(true);
     label1.setBackground(Color.yellow);
//     label1.setForeground(Color.white);
     add(label1);
     setSize(700,120);
     setLocationRelativeTo(null);
     ct = new Clock(this); 
     setVisible(true);
    }
    public static void main(String[] args) {
        new Digitalcl();
        // TODO code application logic here
    }
    
}
