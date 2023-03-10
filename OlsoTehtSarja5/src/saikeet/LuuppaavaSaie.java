package saikeet;

/**
 * @author Henri Uimonen
*/

public class LuuppaavaSaie extends Thread {

	// Pakkaustason näkyvyys

    int pyydetytKierrokset;
    int kierretytKierrokset;
	
	// Kirjoita parametrillinen konstruktori, joka asettaa pyydetyt kierrokset
	
	
	public LuuppaavaSaie(int pyydetytKierrokset) {
		this.pyydetytKierrokset = pyydetytKierrokset;
	}
	
	// Kirjoita getteri kierretyille kierroksille
	
	public int getKierretytKierrokset() {
		return kierretytKierrokset;
	}

	// Kirjoita metodi run(), jossa säie kiertää toistossa pyydetyt kierrokset 
	// kertaa siten, että kierrettyjen kierrosten loppuarvoksi jää toiston päätyttyä 
	// kierretyt kierrokset. Sen tulee olla lopuksi siis sama kuin pyydetyt kierrokset. 
	// Tulosta jokaisella kierroksella kierroksen numero. 

	public void run(){
		for (int i = 0; i < pyydetytKierrokset; i++) {
			System.out.println("Kierrosnumero " + kierretytKierrokset);
			kierretytKierrokset++;
		}
	}
}
