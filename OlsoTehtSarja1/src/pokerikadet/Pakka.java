package pokerikadet;
import java.util.Random;
/**
*
* @author Henri Uimonen 22.8.2022
*/
public class Pakka {
	private int 	 vuorossa = 1;
    final static int KORTTILKM = 52;
    private Kortti[] korttipakka;
    
	// Näiden näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista Luokka.tunnus, esim. Pakka.KORTTILKM

    // Esittele instanssimuuttujat

    // Kirjoita konstruktori, joka alustaa pakan Kortti-olioilla
    public Pakka() 
    {
    	korttipakka = new Kortti[53];
    	int korttivuoro = 1;
    	
    	for ( int i=0; i<4; i++ ) 
    	{
    		for ( int x=1; x<14; x++ ) 
    		{
    			korttipakka[korttivuoro] = new Kortti(i, x);
    			korttivuoro++;
    		}
    	}
    }
    
    // Kirjoita metodi sekoita()
    
    public void sekoita() 
    {
    	for ( int y=0; y<100; y++ ) 
    	{
    		Random rand = new Random();
    		// Get number between 1-52
    		int new1 = rand.nextInt(52);
    		int new2 = rand.nextInt(52);
    		new1+=1;
    		new2+=1;
    		
    		Kortti temp = korttipakka[new1];
    		korttipakka[new1] = korttipakka[new2];   		
    		korttipakka[new2] = temp;     		
    	}
    	
    }
    // Kirjoita metodi annaKortti()
    public Kortti annaKortti() 
    {
    	Kortti palautettava;
    	if ( vuorossa < 53 ) 
    	{
    		palautettava = korttipakka[vuorossa];
    		vuorossa++;    		
    	}
    	else
    	{
    		vuorossa = 1;
    		palautettava = korttipakka[vuorossa];

    	}
    	return(palautettava);
    }
}
