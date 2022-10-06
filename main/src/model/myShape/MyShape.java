/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.myShape;

import model.myShape.Draw;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author mvdotsenko
 */
public class MyShape extends Observable{
    RectangularShape shape;
    Color color;
    TypeFill tf;
    public MyShape(RectangularShape shape) {
        this.shape = shape;
        color = Color.RED;
        tf = new Draw();
    }

    public MyShape() {
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }

    public void setFrame(Point2D[] p) {
        shape.setFrameFromDiagonal(p[0], p[1]);
        
    }

    public void setTF(TypeFill TF) {
        this.tf = TF;
    }
    
    public void draw(Graphics2D g2) {
       if(shape!=null) tf.draw(g2,this);
    }

    
}
