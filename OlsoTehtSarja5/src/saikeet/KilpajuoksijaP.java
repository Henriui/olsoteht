package saikeet;

import java.util.Random;

/**
 * @author Henri Uimonen
*/

public class KilpajuoksijaP extends Thread {
	private int numero; 				 // juoksijan numero
	private final int MATKA = 400; 		 // juostava matka, tässä vakio
	private double aika; 				 // sekunteina

	private static int seuraavaNumero=1; // luokkamuuttuja juoksijoiden numeroimiseksi
	// Tee tälle muuttujalle set-metodi

	public static void setSeuraavaNumero(int seuraavaNumero) {
		KilpajuoksijaP.seuraavaNumero = seuraavaNumero;
	}

	public KilpajuoksijaP() {
		numero = seuraavaNumero;
		seuraavaNumero++;
	}

	@Override
	public void run(){
		int juostumatka = 0;
		int kierrosaikaNs = 0;
		Random rand = new Random();

		while(juostumatka != MATKA)
		{
			kierrosaikaNs = rand.nextInt(500) + 1000; // 43 - 60 sek koko hommaan, 10 metriä
			try {
				Thread.sleep(kierrosaikaNs);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			juostumatka += 10;
			aika += (double) kierrosaikaNs / 1000;
			if (juostumatka % 50 == 0)
			{
				System.out.println("Juoksija "+ numero +" juossut " + juostumatka + " ajassa " + aika );
			}
		}

		System.out.println(numero + " juoksijalla loppuaika: " + aika);


	// Ohjelmoi toisto, jossa
	// - käytät satunnaislukugeneraattoria 10 metrin juoksuajan saamiseksi
	// - odotat ko. ajan
	// - tulostat väliaikatiedon 50 metrin välein
	
	}

	public double getAika(){
		return aika; 
	}

    public Integer getNumero() {
        return numero;
    }
}
