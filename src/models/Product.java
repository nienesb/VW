/*
 * This file was created to facilitate lessons at HBO-ICT@HvA.
 */
package models;

/**
 *
 * @author Dennis Breuker (d.m.breuker@hva.nl)
 */
public class Product {
    /**
     * Symbool voor Euro-teken
     */
    
    public static final String EURO = "\u20AC";

    private String naam;
    private double prijs;
    
    public Product (String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }
    
    public boolean isLegaal () {
        return true;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }
    
    @Override
    public String toString() {
        return "Naam: " + naam + "\n\t"
                + "  Prijs: " + EURO + String.format("%.2f", prijs);
    }
}
