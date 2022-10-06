/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Netbeans
 */
public class Qeue implements TypeList{
    
    
    @Override
    public void push(int i,List list){
        list.addEnd(i);
    }
    @Override
    public void pop(List list){
        list.head = list.head.next;
    }
}
