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
public class NoSpeak implements SpeakBehaver{

    @Override
    public void speak(String str) {
        System.out.println("I can't "+str);
    }
    
    
}
