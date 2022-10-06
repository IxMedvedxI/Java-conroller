/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;
/**
 *
 * @author Netbeans
 */
public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame(MyPanel p) {
        panel = p;
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    
}
