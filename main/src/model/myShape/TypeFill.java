/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.myShape;

import model.myShape.MyShape;
import java.awt.Graphics2D;
import java.awt.geom.RectangularShape;

/**
 *
 * @author mvdotsenko
 */
public interface TypeFill {
    public void draw(Graphics2D g2, MyShape shape);
}
