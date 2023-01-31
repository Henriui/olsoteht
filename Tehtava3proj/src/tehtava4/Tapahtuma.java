package tehtava4;

public class Tapahtuma implements Comparable<Tapahtuma> {

    private int    aika;
    private Tyyppi tyyppi;

    public Tapahtuma(Tyyppi tyyppi, int aika)
    {

        this.aika = aika;
        this.tyyppi = tyyppi;
    }


    @Override
    public int compareTo(Tapahtuma o) {
        return aika - o.aika;
    }

    @Override
    public String toString() {
        return "Tapahtuma [aika=" + aika  + ", tyyppi=" + tyyppi + "]";
    }


    public int getAika() {
        return aika;
    }

}
