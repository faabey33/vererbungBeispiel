/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbungbeispiel;

/**
 *
 * @author fabi
 */
public class GeldBetrag {
    
    private double betrag;
    
    public GeldBetrag() {
        setBetrag(0);
    }
    
    public GeldBetrag(double betrag) {
        setBetrag(betrag);
    }   

    public GeldBetrag addieren(GeldBetrag b) {
        double neu = getBetrag() + b.getBetrag();
        return new GeldBetrag(neu);
    }
    
    /**
     * @return the betrag
     */
    public double getBetrag() {
        return betrag;
    }

    /**
     * @param betrag the betrag to set
     */
    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }
}
