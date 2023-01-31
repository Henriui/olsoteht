
package suorakulmiot;
/**
 *
 * @author Henri Uimonen
 */

// Kirjoita tähän yleiskommentit

public class Testi2 {

    public static void main(String[] args) {
        // Kirjoita tähän testaamisessa tarvitsemasi lauseet

        IKuvio nSuorakulmio = new NaytonSuorakulmio(225, 120, 800, 30);
        System.out.println( nSuorakulmio.toString());
        System.out.println( ((NaytonSuorakulmio) nSuorakulmio).mahtuu(1024, 768));

        IKuvio suorakulmio = new Suorakulmio(80, 40);
        System.out.println(suorakulmio.toString() + ", ala= " + ((Suorakulmio) suorakulmio).ala());
    }
}
