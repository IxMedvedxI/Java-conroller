/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.model;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Observable;
import model.myShape.MyShape;

/**
 *
 * @author mvdotsenko
 */
public class Model extends Observable{
    MyShape currentShape;
    ArrayList<MyShape> list;

    public Model(MyShape currentShape) {
        this.currentShape = currentShape;
        list = new ArrayList<MyShape>();
        list.add(currentShape);
    }
    public void add(MyShape shape){
        list.add(shape);
        setChanged();
        notifyObservers();
    }
    
    public void draw(Graphics2D g){

        for(int i = 0; i < list.size();i++){
            list.get(i).draw(g);
        }
    }
}
