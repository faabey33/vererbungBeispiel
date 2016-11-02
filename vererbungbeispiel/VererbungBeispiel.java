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
public class VererbungBeispiel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Neuen Privatkunden mit allem drum und dran erstellen
        Privatkunde fabian = new Privatkunde("Fabian", "Mz", 48151623, new Adresse("Deutschland", "Trier", "Paulinstraße 1", 54511)); 
        //Neuen Geschäftskunden erstellen
        Geschaeftskunde microsoft = new Geschaeftskunde("Microsoft", new Adresse("USA", "San Francisco", "700 Main Street", 78192), 48151624);
        
        //Konten für Kunden erstellen - mit oder ohne Startkapital - oder Geld einzahlen
        Konto konto = new Konto("Girokonto", 200.20);
        Konto konto2 = new Konto("Sparbuch");
        konto2.einzahlen(new GeldBetrag(50.00));
        Konto konto3 = new Konto("Micorsoft Surface Kredit", 1000000.00);
        
        //Kunden ein Konto zuweisen
        fabian.addKonto(konto);
        fabian.addKonto(konto2);
        microsoft.addKonto(konto3);
             
        //Ausgabe in Konsole
        System.out.print(fabian.toString());
        System.out.print(microsoft.toString());
    }
    
}
