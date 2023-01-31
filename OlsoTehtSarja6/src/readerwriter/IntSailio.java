package readerwriter;

/**
* @author Henri Uimonen
*/

// IntSailio on luokka, johon rakennetaan monitori
// määrittelelmällä joukko synkronoituja metodeja

public class IntSailio {
	private int arvo;

	public IntSailio() {
		arvo = 0; 	// 0 edustaa tyhjää säiliötä
	}

	public synchronized int getInt() throws InterruptedException {
	  	while (arvo == 0){ // tyhjästä ei voi nyhjäistä
	   		wait();
	   	}
		
	   	int paluuarvo = arvo;
	   	if (arvo < 0)
			paluuarvo = 0;
		else
			arvo = 0; 		// tyhjennä säiliö
			
		

	   	notifyAll(); 	// herätä kaikki odottajat
	   	return paluuarvo;
	}

	public synchronized void setInt(int n) throws InterruptedException {
	   	while (!(arvo == 0)){ // vain tyhjään saa viedä uuden arvon
	   		wait();
	   	}
		
	   	arvo = n;
	   	notifyAll();
	 }
}




