package kahvila;

/**
 *
 * @author Henri Uimonen 27.8.2022
 */
public class Tuote {

    private int tuotenumero;
    private String nimi;
    private double hinta;
    private static int seuraavaVapaaTuotenumero = 1;

    public Tuote(String nimi, double hinta)
    {
        this.nimi = nimi;
        this.hinta = hinta;
        tuotenumero = seuraavaVapaaTuotenumero;
        seuraavaVapaaTuotenumero += 1;
    }
    public static void alustaSeuraavaVapaaTuotenumero()
    {
        seuraavaVapaaTuotenumero = 1;
    }
    public String getNimi()
    {
        return this.nimi;
    }
    public double getHinta()
    {
        return this.hinta;
    }
    public int getTuotenumero()
    {
        return this.tuotenumero;
    }
    public String toString()
    {
        return (tuotenumero + ": " + nimi + ", " + hinta);
    }
}
