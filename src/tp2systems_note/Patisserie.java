/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2systems_note;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Simon GRondin
 */
public class Patisserie extends ArrayBlockingQueue<Gateau> /*ArrayList<Gateau>     code du grand 1, Partie B*/ {

    public Patisserie(int capacity) {
        super(capacity);
    }
    
    
    
    
    public void depose(Gateau g){
        System.out.println("(Depot d'un "+ g.toString()+")");
        try {
            put(g);
        } catch (InterruptedException ex) {
            System.out.println("Waiting for room within the queue interrupted");
        }
        /*
        if(getStock()>=1){    code du grand 1, partie B
            notify();
        }
        */
    }
    
    public Gateau acheter(){
        /*while(getStock()==0){    code du grand 1, partie B
            try{
                wait();
            }catch(InterruptedException e){
                
            }
        }
        */
        Gateau g=null;
        try{
             g = take() /*get(0)      code du grand 1, partie B*/;
        }catch(InterruptedException e) {
            System.out.println("Waiting for a new cake interrupted");
        }
        if (g!=null)System.out.println("(Achat de "+g.toString()+")");

        //remove(g);
        return g;
    }
    
    public int getStock(){
        return size();
    }
    
}
