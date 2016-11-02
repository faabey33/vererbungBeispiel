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
public class Konto {
    private String bezeichnung;
    private double guthaben;
    
    public Konto(String bezeichnung, double guthaben) {
        setBezeichnung(bezeichnung);
        setGuthaben(new GeldBetrag(guthaben));
    }
    
    public Konto(String bezeichung) {
        setBezeichnung(bezeichung);
        setGuthaben(new GeldBetrag(0));
    }
    
    public GeldBetrag saldo() {
        return new GeldBetrag(guthaben);
    }
    
    public void einzahlen(GeldBetrag betrag) {
        setGuthaben(getGuthaben().addieren(betrag));
    }

    /**
     * @return the bezeichnung
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * @param bezeichnung the bezeichnung to set
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * @return the guthaben
     */
    public GeldBetrag getGuthaben() {
        return new GeldBetrag(guthaben);
    }

    /**
     * @param guthaben the guthaben to set
     */
    public void setGuthaben(GeldBetrag guthaben) {
        this.guthaben = guthaben.getBetrag();
    }
}
