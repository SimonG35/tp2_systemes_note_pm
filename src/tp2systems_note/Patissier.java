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
public class Patissier implements Runnable {

    private String nom;
    private Patisserie p;
    private int counter;
    
    public Patissier (Patisserie pat, String n){
        p=pat;
        counter =0;
        nom=n;
    }
    
    @Override
    public void run() {
        try{
            while (counter <20){
                Gateau g = new Gateau("Raisintine");
                p.depose(g);
                counter++;
                System.out.println(nom +" : j'ai fait un "+g.toString()+" en numero "+counter+".");
                Thread.sleep(1000);                
            }
            p.depose(Gateau.GATEAU_EMPOISONNE);
        } catch(InterruptedException e){
            System.out.println("can't sleep, has to bake");
                    
        }
    }
    
}
