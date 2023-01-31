package halkohomma;

import java.util.Random;

/**
* @author Henri Uimonen
*/

public class Partiolainen extends Thread{

    private volatile boolean paalla = true;
    private Halkovarasto varasto;
    private int puutarve;
    private Random rand = new Random();


    public Partiolainen(Halkovarasto varasto){
        this.varasto = varasto;
    }

    public void paistaLettu(Halkovarasto varasto){
        puutarve = rand.nextInt(5)+1;
        varasto.vieHalkoja(puutarve);
        try {
            Thread.sleep(rand.nextInt(4000)+1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("hain " + puutarve + " puuta varastosta");
    }

    @Override
    public void run() {
        while(paalla){
            paistaLettu(varasto);
        }
    }

}