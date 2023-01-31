import saikeet.OmaSaie;

/**
 * @author Henri Uimonen
 */

public class OmaSaieMain {

	// Säiettä testaava pääohjelma
	public static void main(String[] args) throws InterruptedException {
		OmaSaie saie;
		System.out.println("Säiepääohjelma");

		// Luo OmaSaie alkuarvolla 15

		saie = new OmaSaie(15);

		// Tulosta alkuarvot
		System.out.println("Alkuarvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());
		
		// Käynnistä säie ja odota sen päättymistä

		saie.start();
		saie.join();

		// Tulosta uudet arvot
		System.out.println("Uudet arvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());
		// Luo uusi OmaSaie alkuarvolla 2021
		saie = new OmaSaie(2021);

		// Tulosta alkuarvot
		System.out.println("Alkuarvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

		// Käynnistä säie ja odota sen päättymistä

		saie.start();
		saie.join();

		// Tulosta uudet arvot
		System.out.println("Uudet arvot ovat " + saie.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

	}

}
