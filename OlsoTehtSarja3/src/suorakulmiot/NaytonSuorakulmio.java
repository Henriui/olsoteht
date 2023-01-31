
package suorakulmiot;
/**
 *
 * @author Henri Uimonen
 */

// Kirjoita tähän yleiskommentit

public class NaytonSuorakulmio extends Suorakulmio {

    private int x, y;

    public NaytonSuorakulmio(int x, int y, int leveys, int korkeus) {
        super(leveys, korkeus);
        this.x = x;
        this.y = y;
    }

    public boolean mahtuu(int leveys, int korkeus){
        if (getLeveys() + x  > leveys || getKorkeus() + y > korkeus)
            return false;

        return true;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y + ", " + super.toString();
    }
}
