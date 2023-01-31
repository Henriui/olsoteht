package halkohomma;

import java.util.Random;

/**
* @author Henri Uimonen
*/

public class HalkohommaMain { 
	public static void main(String args[]) {
	Random rand = new Random();
	// Luo Halkovarasto
	Halkovarasto varasto = new Halkovarasto();
	// Luo useita Halonhakkaaja-säikeitä
	Halonhakkaaja hakkaaja = new Halonhakkaaja(varasto);
	Halonhakkaaja hakkaaja2 = new Halonhakkaaja(varasto);
	// Luo useita partiolainen säikeitä
	Partiolainen p1 = new Partiolainen(varasto);
	Partiolainen p2 = new Partiolainen(varasto);
	Partiolainen p3 = new Partiolainen(varasto);
	Partiolainen p4 = new Partiolainen(varasto);
	Partiolainen p5 = new Partiolainen(varasto);

	// Tämä main() saa lopettaa.
	hakkaaja.start();
	hakkaaja2.start();

	p1.start();
	p2.start();
	p3.start();
	p4.start();
	p5.start();
	

	}
}