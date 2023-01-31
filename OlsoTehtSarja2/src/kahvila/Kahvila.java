package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Henri Uimonen
 */
public class Kahvila {

    // Esittele instanssimuuttuja valikoiman ja tilausten tallettamiseksi (ArrayList)
    private Valikoima valikoima;
	private ArrayList<Tilaus> tilaukset = new ArrayList<Tilaus>();
    // Ohjelmoi yhden parametrin konstruktori
	public Kahvila(Valikoima valikoima)
	{
		this.valikoima = valikoima;
	}
    // Ohjelmoi lisääTilaus()
	public void lisääTilaus(Tilaus tilaus)
	{
		tilaukset.add(tilaus);
	}
    // Ohjelmoi toString(), joka palauttaa merkkijonoesityksen KAhvila-oliosta
	public String toString()
	{
        String tilaus = "";
        double loppusumma = 0;
        for (Tilaus x : tilaukset)
        {
            loppusumma += x.annaLoppusumma();
            if (x.toString() != null)
                tilaus += (x.toString() + " ");
        }
		return (tilaus + " " + loppusumma);
	}
}
