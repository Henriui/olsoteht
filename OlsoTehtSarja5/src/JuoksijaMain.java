import saikeet.Juoksija;

/**
 * @author Henri Uimonen
*/

public class JuoksijaMain {
	public static void main(String[] args) {

	// Luo ja käynnistä Juoksija-säie
	Juoksija juoksija = new Juoksija();
	juoksija.start();
	// Odota jonkun aikaa: Thread.sleep()
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// Pysäytä säie
	System.out.println("Seis");
	juoksija.lopeta();

	System.out.println("Juokseeko? " + juoksija.isJuoksemassa());
	
	// Hae ja tulosta juostujen kerrosten määrä
	
	System.out.println("Juostut kierrokset " + juoksija.getKierrokset());
	}
}
