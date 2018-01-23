/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2systems_note;

/**
 *
 * @author Simon Grondin
 */
public class TP2Systems_note {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Creation des objets métiers
        Patisserie pat = new Patisserie(10);
        Patissier p = new Patissier(pat,"Pierre");
        Patissier p1 = new Patissier(pat,"Paul");
        Client c1 = new Client(pat, "Michel");
        Client c2 = new Client(pat, "Jean-Jacques");
        
        // Creation des threads sur objets runnables
        Thread t1 = new Thread(p);
        Thread t12 = new Thread(p1);
        Thread t2 = new Thread(c1);
        Thread t3 = new Thread(c2);
        
        //Lancement des threads
        t1.start();
        t12.start();
        t2.start();
        t3.start();
        
    }
    
}
