
import java.util.ArrayList;

import saikeet.Juoksija;
import saikeet.Kilpajuoksija;

/**
 * @author Henri Uimonen
*/

public class KilpailuMain {

	private static int KILPAILIJALKM = 8;
	
	public static void main(String[] args) {
		// Luo taulukko juoksijoita varten

		ArrayList<Kilpajuoksija> juoksijat = new ArrayList<>();

		// Luo juoksijasäikeet
	
		for (int i = 0; i < 8; i++) {
			juoksijat.add(new Kilpajuoksija());
		}

		// Pistä poppoo juoksemaan

		for (Kilpajuoksija kilpajuoksija : juoksijat) {
			kilpajuoksija.start();
		}

		// Odota, että kaikki juoksijasäikeet lopettavat
		
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Lopputulos:");

		for (Kilpajuoksija kilpajuoksija : juoksijat) {
		 System.out.println("Juoksija " + kilpajuoksija.getNumero() + " juoksi ajassa " + kilpajuoksija.getAika());
		}

		System.out.println("Kilpailu on ohi, onnea voittajalle.");
	}
}
