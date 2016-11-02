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
public class Geschaeftskunde extends Kunde {
    
    private String firmenname;
    private Adresse domizilAdresse;

    public Geschaeftskunde(String firmenname, Adresse adresse, int kundennummer) {
        setDomizilAdresse(adresse);
        setFirmenname(firmenname);
        setKundennummer(kundennummer);
    }
    
    /**
     * @return the firmenname
     */
    public String getFirmenname() {
        return firmenname;
    }

    /**
     * @param firmenname the firmenname to set
     */
    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    /**
     * @return the domizilAdresse
     */
    public Adresse getDomizilAdresse() {
        return domizilAdresse;
    }

    /**
     * @param domizilAdresse the domizilAdresse to set
     */
    public void setDomizilAdresse(Adresse domizilAdresse) {
        this.domizilAdresse = domizilAdresse;
    }
    
    @Override 
    public String toString() {
       String a = "----------------------\nKunde: "+getFirmenname()+"\n"+
               "Adresse: "+getDomizilAdresse().getLand()+", "+getDomizilAdresse().getStadt()+
               ", "+getDomizilAdresse().getStrasse()+"\n"+"Konten: \n";
               
       for (int i = 0; i < getKonten().size(); i++) {
           Konto konto = getKonten().get(i);
           a += konto.getBezeichnung()+" - Guthaben: "+konto.saldo().getBetrag()+"\n";
       }
       return a;
    }
       
}
