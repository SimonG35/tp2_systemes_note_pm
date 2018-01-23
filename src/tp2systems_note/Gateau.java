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
public class Gateau {
    
    public static final Gateau GATEAU_EMPOISONNE = new Gateau("Poison");
    
    private String gout;
    
    public Gateau (String g){
        gout=g;
    }
    
    @Override
    public String toString(){
        return "Gateau gout " + gout;
    }
    
}
