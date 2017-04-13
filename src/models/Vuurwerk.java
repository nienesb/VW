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
public class Vuurwerk extends Product {
    
    private Instructie instructie;
    
    public Vuurwerk (String naam, double prijs, Instructie instructie) {
        super(naam, prijs);
        this.instructie = instructie;
    }
    
    @Override
    public boolean isLegaal () {
        if (this.instructie != null && this.instructie.isNederlandstalig() == true) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString () {
        if(this.instructie != null) {
        return "Naam: " + super.getNaam() + "\n\t" + "Prijs: \u20AC" + super.getPrijs() +
                "\n\t" + "Instructie: " + this.instructie + "\n\t" + "Legaal: " +
                isLegaal(); }
        return "Naam: " + super.getNaam() + "\n\t" + "Prijs: \u20AC" + super.getPrijs() +
                "\n\t" + "Instructie: ontbreekt" + "\n\t" + "Legaal: " +
                isLegaal();
    } 
    
}
