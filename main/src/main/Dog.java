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
public class Dog extends Mammal{
    
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    
    @Override
    public void speak() {
        sb.speak("Gaf");
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", age=" + age + '}';
    }
    
    
    
}
