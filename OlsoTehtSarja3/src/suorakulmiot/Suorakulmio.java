
package suorakulmiot;
/**
 *
 * @author Oma Nimesi
 */
 
// Kirjoita tähän yleiskommentit

public class Suorakulmio implements IKuvio {

    private int korkeus, leveys;

    public Suorakulmio() {
    }

    public Suorakulmio(int leveys, int korkeus) {
        this.korkeus = korkeus;
        this.leveys = leveys;
    }

    public int ala(){
        return (korkeus*leveys);
    }

    public int getKorkeus() {
        return korkeus;
    }

    public void setKorkeus(int korkeus) {
        this.korkeus = korkeus;
    }

    public int getLeveys() {
        return leveys;
    }

    public void setLeveys(int leveys) {
        this.leveys = leveys;
    }

    @Override
    public String toString() {
        return "leveys=" + leveys + ", korkeus=" + korkeus;
    }

    
}
