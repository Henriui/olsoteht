package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Henri Uimonen
 */
public class Valikoima {

    // Esittele ArrayList tuotteiden tallettamiseksi
    ArrayList<Tuote> valikoima = new ArrayList<Tuote>();

    // Ohjelmoi getTuote()
    public Tuote getTuote(int tuotenumero)
    {
        Tuote tuote = null;
        for (Tuote x : valikoima)
        {
            if (x.getTuotenumero() == tuotenumero)
            {
                return x;
            }
        }
        return tuote;
    }
    // Ohjelmoi getTuote()
    public Tuote getTuote(String nimi)
    {
        Tuote tuote = null;
        for (Tuote x : valikoima)
        {
            if (x.getNimi() == nimi )
                tuote = x;
        }
        return tuote;
    }
    // Ohjelmoi lisääTuote()
    public void lisääTuote(Tuote tuote)
    {
        for (Tuote x : valikoima)
        {
            if (x.getTuotenumero() == tuote.getTuotenumero() )
                return;
             else if (x.getNimi() == tuote.getNimi() )
                return;
        }
        valikoima.add(tuote);
    }
    // Ohjelmoi poistaTuote()
    public boolean poistaTuote(int tuotenumero)
    {
        for (Tuote x : valikoima)
        {
            if (x.getTuotenumero() == tuotenumero)
            {
                valikoima.remove(x);
                return true;
            }
        }
        return false;
    }
    // Poistettava Tuote-olio pitää etsiä listasta tuotenumerolla,
    // koska poistojen jälkeen tuotenumero != listan indeksi

    // Ohjelmoi toString(), joka on merkkijonoesitys Valikoima-oliosta (eli kaikista tuotteista)
    @Override
    public String toString() 
    {
        String palautus = "";
        for (Tuote x : valikoima)
        {
            palautus += x.getNimi() + " ";
        }
        return palautus;
    }
}
