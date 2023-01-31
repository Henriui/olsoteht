import kahvila.*;

/**
 *
 * @author Laita tähän oma nimesi ja päiväys
 */

public class Main {

    public static void main(String[] args) {

    // Esittele tarvittavat muuttujat.
    Valikoima valikoima = new Valikoima();
    // Luo kolme tuotetta.
    
    Tuote tuote1 = new Tuote("Ystävänpäivän munkki", 1.0); // tuotenumero = 1
    Tuote tuote2 = new Tuote("Runebergin torttu", 2.55); // tuotenumero = 2
    Tuote tuote3 = new Tuote("Dallaspulla", 2.25); // tuotenumero = 3
			
    // Lisää ne valikoimaan.
    valikoima.lisääTuote(tuote1);
    valikoima.lisääTuote(tuote2);
    valikoima.lisääTuote(tuote3);
    // Tulosta valikoima.
    System.out.println("valikoima : " + valikoima.toString());
    // Poista siitä yksi tuote.
    valikoima.poistaTuote(tuote2.getTuotenumero());
    // Tulosta muuttunut valikoima.
    System.out.println( valikoima.toString());
    // Luo tilaus.
    Tilaus tilaus = new Tilaus();
      // Luo kaksi tilausriviä.
    Tilausrivi tilausrivi1 = new Tilausrivi(valikoima, 1, 2);
    Tilausrivi tilausrivi2 = new Tilausrivi(valikoima, 3, 3);
    // Lisää tilausrivit tilaukseen.
    tilaus.lisääRivi(tilausrivi1);
    tilaus.lisääRivi(tilausrivi2);
    
    // Lisää tilaus kahvilan tilauslistaan.
    Kahvila kahvila = new Kahvila(valikoima);
    kahvila.lisääTilaus(tilaus);
    // Luo toinenkin tilaus tilausriveineen.
    Tilaus tilaus2 = new Tilaus();
    Tilausrivi tilausrivi3 = new Tilausrivi(valikoima, 1, 2);
    Tilausrivi tilausrivi4 = new Tilausrivi(valikoima, 1, 1);
    tilaus2.lisääRivi(tilausrivi3);
    tilaus2.lisääRivi(tilausrivi4);
    kahvila.lisääTilaus(tilaus2);
    // Tulosta kaikki kahvilan tilaukset.
    System.out.println(kahvila.toString());

    // Lisää tuote valikoimaan.
    Tuote tuote4 = new Tuote("PullaPulla", 2.25); // tuotenumero = 3
    valikoima.lisääTuote(tuote4);
    // Tulosta valikoima.
      System.out.println( valikoima.toString());
    // Poista tuote valikoimasta.
    valikoima.poistaTuote(1);
    // Kirjaa tilaus.
    Tilaus tilaus3 = new Tilaus();
    Tilausrivi tilausrivi5 = new Tilausrivi(valikoima, 4, 20);
    Tilausrivi tilausrivi6 = new Tilausrivi(valikoima, 4, 10);
    // Tulosta kaikki tilaukset.

    }
}
