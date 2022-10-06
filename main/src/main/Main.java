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
public class Main {public Cat cat = new Cat("Peta",5);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hello world");
        Mammal cat = new  Dog("Kata",2);
        List list = new List( new Qeue());
        for(int j = 0; j < 6; j++){
            list.push(j);
        }
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.setTypeList(new Stack());
        list.push(7);
        list.push(8);
        System.out.println(list);
        list.pop();
        System.out.println(list);
        /*
        
        Homezoo zoo = new Homezoo();
        Mammal cat1 = new Cat("Vasa",2,new Speak());
        try{
            zoo.add(cat1);
            zoo.add(new Cat("Vasa",2,new Speak()));
            zoo.add(new Cat("Vasa",2,new Speak()));
        }
        catch(ArrayIndexOutOfBoundsException ex){
            zoo.inscreaseZoo(3);
             zoo.add(new Cat("Vasa",2,new Speak()));
        }
        try{
            zoo.speakAll();
        }
        catch(NullPointerException ex){
            System.out.println(""+ex.getMessage());
        }
        
        System.out.println(zoo);
        cat1.setSb(new NoSpeak());
        try{
            zoo.speakAll();
        }
        catch(NullPointerException ex){
            System.out.println(""+ex.getMessage());
        }
        */
    }
}
        
