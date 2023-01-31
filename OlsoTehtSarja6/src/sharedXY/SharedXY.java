package sharedXY;

/**
* @author Henri Uimonen
*/

public class SharedXY {
	private int x;
	private int y;
	
	// Kirjoita konstruktori, joka asettaa muuttujille alkuarvot

	public SharedXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public boolean isSame(){
		if (x == y)
			return true;
		return false;
	}
	
	// Kirjoita metodi swap(), joka vaihtaa arvot keskenään

	public synchronized void swap(){
		int temp = x;
		x = y;
		y = temp;

		System.out.println("Swap. x = " + x + ", y = " + y);
	}
}