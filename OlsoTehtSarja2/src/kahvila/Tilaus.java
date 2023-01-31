package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Henri Uimonen
 */
public class Tilaus {

    // Esittele ArrayList tilausrivien tallettamiseksi
    ArrayList<Tilausrivi> tilausrivi = new ArrayList<Tilausrivi>();
    // Ohjelmoi lisääRivi()
    public void lisääRivi(Tilausrivi tilausrivi)
    {
        this.tilausrivi.add(tilausrivi);
    }
    // Ohjelmoi annaLoppusumma()
	public double annaLoppusumma()
    {
        double loppusumma = 0;
        for (Tilausrivi x : tilausrivi)
            loppusumma += x.annaSumma();
        return loppusumma;
    }
    // Ohjelmoi toString, joka palauttaa merkkijonoesityksen yhdestä Tilaus-oliosta
    public String toString()
    {
        String tilaus = "";
        for (Tilausrivi x : tilausrivi)
        {
            if (x.toString() != null)
                tilaus += (x.toString() + " "); 
        }
        return tilaus;
    }
}
