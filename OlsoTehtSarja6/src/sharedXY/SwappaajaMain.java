package sharedXY;

/**
* @author Henri Uimonen
*/

public class SwappaajaMain {
	 public static void main(String args[]) {
		// Luo yhteiskäyttöinen tietorakenneolio
		SharedXY xy = new SharedXY(1, 2);
		// Luo useita Swappaaja-säikeitä
		Swappaaja swap0 = new Swappaaja(xy);
		Swappaaja swap1 = new Swappaaja(xy);
		Swappaaja swap2 = new Swappaaja(xy);
		Swappaaja swap3 = new Swappaaja(xy);
		Swappaaja swap4 = new Swappaaja(xy);
		Swappaaja swap5 = new Swappaaja(xy);
		Swappaaja swap6 = new Swappaaja(xy);
		Swappaaja swap7 = new Swappaaja(xy);
		Swappaaja swap8 = new Swappaaja(xy);
		Swappaaja swap9 = new Swappaaja(xy);
		Swappaaja swap10 = new Swappaaja(xy);
		Swappaaja swap11 = new Swappaaja(xy);

		swap0.start();
		swap1.start();
		swap2.start();
		swap3.start();
		swap4.start();
		swap5.start();
		swap6.start();
		swap7.start();
		swap8.start();
		swap9.start();
		swap10.start();
		swap11.start();


	 }
}