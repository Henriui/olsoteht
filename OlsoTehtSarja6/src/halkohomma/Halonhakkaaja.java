package halkohomma;

import java.util.Random;

/**
* @author Henri Uimonen
*/

public class Halonhakkaaja extends Thread{
    private volatile boolean paalla = true;

	Halkovarasto varasto;

    public Halonhakkaaja(Halkovarasto varasto) {
        this.varasto = varasto;
    }

    public void hakkaa(){
        Random rand = new Random();

        // Hakkaa puut.
    
        int puut = rand.nextInt(5) +1;

        try {
            System.out.println("");
            Thread.sleep(rand.nextInt(2000)+1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hakkasin " + puut + " puuta");
        varasto.tuoHalkoja(puut);
    }

    @Override
    public void run() {
        while(paalla){
            hakkaa();
        }
    }
	 
}