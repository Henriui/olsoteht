import saikeet.LuuppaavaSaie;

/**
 * @author Henri Uimonen
*/

public class LuuppaavaSaieMain {
	public static void main(String[] args) {

    // Luo säie
	LuuppaavaSaie saie = new LuuppaavaSaie(100);
	// Tulosta aluksi kierrettyjen kierrosten lukumäärä
		saie.getKierretytKierrokset();
	// Käynnistä säie
	saie.start();
	// Odota säikeen päättymistä
try {
	saie.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	// Tulosta lopuksi säikeen kiertämien kierrosten lukumäärä
	System.out.println("Kierretyt kierrokset " + saie.getKierretytKierrokset());
	}
}
