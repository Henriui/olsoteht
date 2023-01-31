
package suorakulmiot;
/**
 *
 * @author Henri Uimonen
 */

// Kirjoita tähän yleiskommentit

public class Testi {

    public static void main(String[] args) {
        // Kirjoita tähän testaamisessa tarvitsemasi lauseet

        NaytonSuorakulmio nSuorakulmio = new NaytonSuorakulmio(225, 120, 800, 30);
        System.out.println( nSuorakulmio.toString());
        System.out.println( nSuorakulmio.mahtuu(1024, 768));

        Suorakulmio suorakulmio = new Suorakulmio(80, 40);
        System.out.println(suorakulmio.toString() + ", ala= " + suorakulmio.ala());
    }
}
