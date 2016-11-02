/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbungbeispiel;

import java.util.ArrayList;

/**
 *
 * @author fabi
 */
public class Kunde {
    
    private int kundennummer;
    private ArrayList<Konto> konten = new ArrayList<>();
    
    
    public Kunde() {
        
    }
    
    public void addKonto(Konto konto) {
        this.konten.add(konto);
    }
    
    public void removeKonto(Konto konto) {
        //öhh
    }
    
    public ArrayList<Konto> getKonten() {
        return this.konten;
    }
    
    /**
     * @return the kundennummer
     */
    public int getKundennummer() {
        return kundennummer;
    }

    /**
     * @param kundennummer the kundennummer to set
     */
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
}
