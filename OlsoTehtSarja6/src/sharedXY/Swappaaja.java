package sharedXY;

/**
* @author Henri Uimonen
*/

public class Swappaaja extends Thread {

	private SharedXY xy;
	public Swappaaja(SharedXY xy) {
		this.xy = xy;
	}
	 
	// Kirjoita konstruktori
	 
	// Kirjoita metodi run()
	 
	@Override
	public void run() {
		while (!xy.isSame())
			xy.swap();
		System.exit(0);
	}
}