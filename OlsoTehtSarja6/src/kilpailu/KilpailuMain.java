package kilpailu;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Henri Uimonen
*/

public class KilpailuMain {

	private static int KILPAILIJALKM = 8;
	
	public static void main(String[] args) {
		// Luo taulukko juoksijoita varten

		ArrayList<Kilpajuoksija> juoksijat = new ArrayList<>();

		// Luo juoksijasäikeet
	
		for (int i = 0; i < 3; i++) {
			juoksijat.add(new Kilpajuoksija());
		}

		// Pistä poppoo juoksemaan

		for (Kilpajuoksija kilpajuoksija : juoksijat) {
			kilpajuoksija.start();
		}

		// Kaada yksi juoksija (sori siitä)

		Random rand = new Random();
		
		Kilpajuoksija juoksija = juoksijat.get(rand.nextInt(juoksijat.size()));

		try {
			int kaatumisNs = rand.nextInt(3000 ) + 2000;
			Thread.sleep(rand.nextInt(2000) + 2000);

			juoksija.kaadu(kaatumisNs);

			Thread.sleep(kaatumisNs);

			juoksija.nouse();
			

		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("juoksija nousi");
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
