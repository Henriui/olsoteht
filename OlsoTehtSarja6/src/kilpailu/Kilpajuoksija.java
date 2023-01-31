package kilpailu;

import java.util.Random;

/**
 * @author Henri Uimonen
*/

public class Kilpajuoksija extends Thread {
	private int numero; 				 // juoksijan numero
	private final int MATKA = 400; 		 // juostava matka, tässä vakio
	private double aika; 				 // sekunteina
	private volatile boolean kaatui = false;
	private int kierrosaikaNs = 0;

	private static int seuraavaNumero=1; // luokkamuuttuja juoksijoiden numeroimiseksi
	// Tee tälle muuttujalle set-metodi

	public static void setSeuraavaNumero(int seuraavaNumero) {
		Kilpajuoksija.seuraavaNumero = seuraavaNumero;
	}

	public Kilpajuoksija() {
		numero = seuraavaNumero;
		seuraavaNumero++;
	}

	@Override
	public void run(){
		setPriority(numero);
		int juostumatka = 0;
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

	public synchronized void kaadu(int aika){
		System.out.println("juoksija " + getNumero() + " kaatui ajaksi " + aika / 1000 + " sekuntia");

		kierrosaikaNs += aika;
		kaatui = true;
		while (kaatui){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public synchronized void nouse(){
		notify();
		kaatui = false;
	}
}
