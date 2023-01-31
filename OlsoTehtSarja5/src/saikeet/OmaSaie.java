package saikeet;

/**
 * @author Henri Uimonen
*/

public class OmaSaie extends Thread {
	// Näkyvyysmääre private: näkyvät vain tähän luokkaan

	private int luku;
	private static int yhteisetAjokerrat = 0;
	
	//Kirjoita parametriton konstruktori, joka ei tee mitään
	
	public OmaSaie() {
	}
	
	// Kirjoita parametrillinen konstruktori, joka asettaa arvon instanssimuuttujalle luku

	public OmaSaie(int luku) {
		this.luku = luku;
	}

	// Kirjoita getterit ja setterit
	// Kirjoita set- ja get-metodit staattisen muuttujan arvon asettamiseksi ja kysymiseksi

	
	public int getLuku() {
		return luku;
	}
	public void setLuku(int luku) {
		this.luku = luku;
	}
	public static int getYhteisetAjokerrat() {
		return yhteisetAjokerrat;
	}
	public static void setYhteisetAjokerrat(int yhteisetAjokerrat) {
		OmaSaie.yhteisetAjokerrat = yhteisetAjokerrat;
	}
  
	// Kirjoita metodi run(), joka kasvattaa kummankin muuttujan arvoa yhdellä  

	public void run(){
		luku++;
		yhteisetAjokerrat++;
	}
}
