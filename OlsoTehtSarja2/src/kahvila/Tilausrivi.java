package kahvila;

/**
 *
 * @author Henri Uimonen
 */
public class Tilausrivi {

    // Esittele instanssimuuttujat
    private Tuote tuote;
    private int määrä;
    
    // Ohjelmoi kolmen parametrin konstruktori 
    public Tilausrivi(Valikoima valikoima, int tuotenumero, int määrä) 
    {
    	tuote = valikoima.getTuote(tuotenumero);
    	this.määrä = määrä;
	}     
    // Ohjelmoi annaSumma()
	public double annaSumma()
	{
		return (tuote.getHinta() * määrä);
	}
    // Ohjelmoi toString(), joka palautta merkkijonoesityksen Tilausrivi-oliosta
	public String toString()
	{
		String palautus = tuote.toString() + " " + Integer.toString(määrä);
		return palautus;
	}
}
