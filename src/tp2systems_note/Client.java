/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2systems_note;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Simon Grondin
 */
public class Client implements Runnable {

    private String nom;
    private Patisserie p;
    private int counter;
    private List<Gateau> courses;    
    public Client (Patisserie pat, String n){
        nom = n;
        p=pat;
        counter = 0;
        courses=new ArrayList<>();
    }
    
    @Override
    public void run() {
        while(/*counter<7*/ true){
           Gateau g = p.acheter();
           courses.add(g);
           counter++;
           System.out.println(nom+" : J'ai achete un "+ g.toString() + "(achat numero "+counter+" )");
           if (courses.contains(Gateau.GATEAU_EMPOISONNE)){
               break;
           }
        }
    }
    
}
