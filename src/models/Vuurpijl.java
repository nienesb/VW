/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author j.boeser
 */
public class Vuurpijl extends Vuurwerk {
    
    private double hoogte;
    private int [] kleurverhouding;
    // nodig om array inhoud op te tellen:
    private int sum;
    
    public Vuurpijl (double hoogte, int [] kleurverhouding, String naam, double prijs, Instructie instructie) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
    }
    
    @Override
    public boolean isLegaal() {
        return true;
    }
    
    private boolean correcteKleurverhouding () {
        for (int i : kleurverhouding)
            sum += i;
        if (sum == 100) {
            return true;
        }
        return false;
    }
    
    public String toString () {
        if (correcteKleurverhouding() == true) {
        return super.toString() + 
                "\n\t" + "Hoogte: " + hoogte + 
                "\n\t" + "Kleuren: " + Arrays.toString(kleurverhouding);
    }
        return super.toString() + "\n\t" + "Hoogte: " + hoogte + 
                "\n\t" + "Kleuren: " + Arrays.toString(kleurverhouding) + 
                "\n\t" + "--> FOUT: Onjuiste kleurverhouding, kleur wordt rood";
    }
}
