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
public class Homezoo {
    int n;
    Mammal zoo[];
    int i;
    public Homezoo(){
        n = 2;
        zoo = new Mammal[n];
        i=0;
    }

    public Homezoo(int n) {
        this.n = n;
        zoo = new Mammal[n];
        i=0;
    }
    
    void add(Mammal m)throws ArrayIndexOutOfBoundsException{
       if(i == n)throw new ArrayIndexOutOfBoundsException(i);
        zoo[i]=m;
        i++;
    }
    void speakAll() throws NullPointerException{
        for(Mammal m:zoo){
            if(m == null)throw new NullPointerException();
            m.speak();
        }
    }
    void inscreaseZoo(int n){
        int nHelp = this.n;
        Mammal zooHelp[];
        zooHelp = (Mammal[])zoo.clone();
        this.n = n;
        zoo = new Mammal[n];
        for(int i = 0; i < nHelp;i++){
            zoo[i] = zooHelp[i];
        }
    }
    @Override
    public String toString(){
        String s="";
        for(Mammal m: zoo)
            s+= m + " ";
        return s;
    }
    
}
