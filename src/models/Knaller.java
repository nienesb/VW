/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author j.boeser
 */
public class Knaller extends Vuurwerk {
    
    int aantalKnallen;
    int decibel;
    
    public Knaller (int aantalKnallen, int decibel, String naam, double prijs, Instructie instructie) {
        super(naam, prijs, instructie);
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }
    
    public int getDecibel () {
        return decibel;
    }
    
    @Override
    public boolean isLegaal () {
        if (decibel <= 120) {
        return true;
    }
        return false;
    }
    
    @Override
    public String toString () {
        return super.toString() + "\n\t" + "Decibel: " + getDecibel() + "\n\t" +
                "Aantal knallen: " + aantalKnallen ;
    }
    
}
