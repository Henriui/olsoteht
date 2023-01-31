package halkohomma;

/**
* @author Henri Uimonen
*/

public class Halkovarasto {
	 private final int tila = 100;
     private volatile static int maara = 0;

     public synchronized void vieHalkoja (int monta){
        notifyAll();
        if (maara - monta < 0)
            System.out.println("puut loppu, odota.");
        while (maara - monta < 0)
        {
            try {
                wait();

            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        maara -= monta;
     }

     public synchronized void tuoHalkoja (int halkoja){
        notifyAll();

        while ((halkoja + maara) > tila)
        {
            try {
                System.out.println("puuta liikaa, odota.");
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        maara += halkoja;
     }
	 
}