/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import controller.Controller;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

/**
 *
 * @author Netbeans
 */
public class MyPanel extends JPanel implements Observer{
    Controller controller;
    
    public MyPanel(Controller c){
       controller = c;
        
        addMouseListener (new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                controller.mouseePressed(e.getPoint());
                //System.out.println("mouse Pressed "+ e.getPoint());
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
             @Override
             public void mouseDragged(MouseEvent e) {
                 controller.mouseeDragged(e.getPoint());
                 
             }
            
});
       
            
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D)g;
        controller.draw(g2);
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
    
            
}

    
    

