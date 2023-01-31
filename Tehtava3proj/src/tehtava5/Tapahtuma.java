package tehtava5;

public class Tapahtuma implements Comparable<Tapahtuma> {

    int    aika;

    Tyyppi tyyppi;

    public Tapahtuma(Tyyppi tyyppi, int aika)
    {

        this.aika = aika;
        this.tyyppi = tyyppi;
    }
    
    public int getAika() {
        return aika;
    }

    @Override
    public int compareTo(Tapahtuma o) {
        return aika - o.aika;
    }

    @Override
    public String toString() {
        return "Tapahtuma [aika=" + aika  + ", tyyppi=" + tyyppi + "]";
    }
}
