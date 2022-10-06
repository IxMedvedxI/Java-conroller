/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.myShape;

import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.geom.RectangularShape;

/**
 *
 * @author mvdotsenko
 */
public class Draw implements TypeFill {
    @Override
    public void draw(Graphics2D g2,MyShape shape){
        Paint p = g2.getPaint();
        g2.setColor(shape.color);
        g2.draw(shape.shape);
        g2.setPaint(p);
    }
}
