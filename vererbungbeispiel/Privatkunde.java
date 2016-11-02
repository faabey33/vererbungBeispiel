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
public class Privatkunde extends Kunde {
    
    private String vorname, nachname;
    private Adresse postAdresse;
    
    public Privatkunde(String vorname, String nachname, int kundennummer, Adresse postaddresse) {
        super();
        setKundennummer(kundennummer);
        setNachname(nachname);
        setPostAdresse(postaddresse);
        setVorname(vorname);
    }

    /**
     * @return the vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @param vorname the vorname to set
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * @return the nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * @param nachname the nachname to set
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * @return the postAdresse
     */
    public Adresse getPostAdresse() {
        return postAdresse;
    }

    /**
     * @param postAdresse the postAdresse to set
     */
    public void setPostAdresse(Adresse postAdresse) {
        this.postAdresse = postAdresse;
    }
    
    @Override 
    public String toString() {
       String a = "----------------------\nKunde: "+getVorname()+" "+getNachname()+"\n"+
               "Adresse: "+getPostAdresse().getLand()+", "+getPostAdresse().getStadt()+
               ", "+getPostAdresse().getStrasse()+"\n"+"Konten: \n";
               
       for (int i = 0; i < getKonten().size(); i++) {
           Konto konto = getKonten().get(i);
           a += konto.getBezeichnung()+" - Guthaben: "+konto.saldo().getBetrag()+"\n";
       }
       return a;
    }
}
