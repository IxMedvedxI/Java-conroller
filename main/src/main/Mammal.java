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
public abstract class Mammal {
    String name;
    int age;
    SpeakBehaver sb;

    public void setSb(SpeakBehaver sb) {
        this.sb = sb;
    }
    
    
    public Mammal() {
    }
    
    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Mammal(String name, int age, SpeakBehaver sb) {
        this.name = name;
        this.age = age;
        this.sb = sb;
    }
    
    @Override
    public String toString() {
        return "Mammal{" + "name=" + name + ", age=" + age + '}';
    }
    
   abstract public void speak();
    
}
