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
public class Speak implements SpeakBehaver{

    @Override
    public void speak(String str) {
        System.out.println(str);
    }
    
}
