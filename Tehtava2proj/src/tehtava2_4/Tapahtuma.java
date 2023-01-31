package tehtava2_4;

public class Tapahtuma implements Comparable<Tapahtuma> {

    private int    aika;
    private String nimi;
    private Tyyppi tyyppi;
    
    public enum Tyyppi
    {
        SAAPUMINEN, 
        POISTUMINEN
    }

    public Tapahtuma(String nimi, int aika, String tyyppi)
    {
        this.nimi = nimi;
        this.aika = aika;
        this.tyyppi = Tyyppi.valueOf(tyyppi);
    }

    public int getAika() {
    	return this.aika;
    }

    @Override
    public int compareTo(Tapahtuma o) {
        return aika - o.aika;
    }

    @Override
    public String toString() {
        return "Tapahtuma [nimi=" + nimi + ", aika=" + aika  + ", tyyppi=" + tyyppi + "]";
    }
}
