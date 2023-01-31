
import java.util.ArrayList;

import saikeet.Juoksija;
import saikeet.KilpajuoksijaP;

/**
 * @author Henri Uimonen
*/
/*
 * T6:
 * Prioriteetin ei pitäisi vaikuttaa, koska kilpailijoille lasketaan "aika" random arvoilla.
 * Jos kilpailussa runtime vaikuttaisi, niin saattaisi vaikuttaa koska korkeamman prioriteetin
 * säikeet menee ensin.
 * 
 * Saattaisi vaatia enemmän säikeitä, että vaikutus näkyisi tässäkin. 
 * 
 * 
 */
public class KilpailuMainP {

	private static int KILPAILIJALKM = 8;
	
	public static void main(String[] args) {
		// Luo taulukko juoksijoita varten

		ArrayList<KilpajuoksijaP> juoksijat = new ArrayList<>();

		// Luo juoksijasäikeet
	
		for (int i = 0; i < 8; i++) {
			juoksijat.add(new KilpajuoksijaP());
		}

		// Pistä poppoo juoksemaan

		for (KilpajuoksijaP kilpajuoksija : juoksijat) {
			kilpajuoksija.start();
		}

		// Odota, että kaikki juoksijasäikeet lopettavat
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Lopputulos:");

		for (KilpajuoksijaP kilpajuoksija : juoksijat) {
		 System.out.println("Juoksija " + kilpajuoksija.getNumero() + " juoksi ajassa " + kilpajuoksija.getAika());
		}

		System.out.println("Kilpailu on ohi, onnea voittajalle.");
	}
}
