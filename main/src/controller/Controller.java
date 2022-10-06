/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import model.model.Model;
import view.MyFrame;

import model.myShape.MyShape;
import model.myShape.Fill;
import model.myShape.Draw;
import view.MyPanel;

/**
 *
 * @author mvdotsenko
 */
public class Controller {
    Point2D p[];
    MyPanel panel;
    MyFrame frame;
    MyShape shape;
    Model model;
    int n = 0;
    public Controller() {
        shape = new MyShape(new Rectangle2D.Double());
        p = new Point2D[2];
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
        //shape.addObserver(panel);
        model = new Model(shape);
        model.addObserver(panel);
        
    }
    

    public void mouseePressed(Point point) {
        p[0] = point;
        if(n % 2 == 0){
            shape.setTF(new Draw());
        }else{
            shape.setTF(new Fill());
        }
        n++;
    }

    public void mouseeDragged(Point point) {
        p[1] = point;
        shape.setFrame(p);
        model.add( shape);
    }

    public void draw(Graphics2D g2) {
        model.draw(g2);
    }
}
