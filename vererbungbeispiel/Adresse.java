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
public class Adresse {
    
    private String land;
    private String stadt;
    private String strasse;
    private int plz;
    
    public Adresse(String land, String stadt, String strasse, int plz) {
        setLand(land);
        setStadt(stadt);
        setStrasse(strasse);
        setPlz(plz);
    }

    /**
     * @return the land
     */
    public String getLand() {
        return land;
    }

    /**
     * @param land the land to set
     */
    public void setLand(String land) {
        this.land = land;
    }

    /**
     * @return the stadt
     */
    public String getStadt() {
        return stadt;
    }

    /**
     * @param stadt the stadt to set
     */
    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    /**
     * @return the strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @param strasse the strasse to set
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @return the plz
     */
    public int getPlz() {
        return plz;
    }

    /**
     * @param plz the plz to set
     */
    public void setPlz(int plz) {
        this.plz = plz;
    }
}
