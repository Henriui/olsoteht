package pokerikadet;
/**
*
* @author Henri Uimonen 22.8.2022
*/
import java.util.Arrays;

public class Kasi {
	
    final static int EIVÄRI = 0, EISUORA = 0, SUORA = 1, VÄRI = 2, VÄRISUORA = 3;
    private Kortti[] kasi;
    private int 	 arvo;

    // Kasi
    
    public Kasi(Pakka pakka) 
    {
    	kasi = new Kortti[5];
    	for ( int i=0; i<5; i++ ) 
    	{
    		kasi[i] = pakka.annaKortti();    		
    	}
    }
    
    public Kasi(Kortti[] kasi) 
    {
    	this.kasi = kasi;
    }
    
    // annaArvo
    
    public int annaArvo()
    {
    	int   ekaMaa = kasi[0].getMaa();
    	int   vertailu;
    	int   suoraArvo = 0;
    	int   variArvo = 0;
    	int[] arvot = {0,0,0,0,0};
    	
    	for( int i = 1; i<5; i++ )
    	{
    		if ( ekaMaa != kasi[i].getMaa() ) 
    		{
    			variArvo = EIVÄRI;
    			break;
    		}
    			variArvo = VÄRI;
    	}
    	
    	for ( int i=0; i<5;i++ ) 
    	{
    		arvot[i] = kasi[i].getArvo();
    	}
    	
    	// Sort array and compare items to first item plus one.
    	
    	Arrays.sort(arvot);
    	
    	vertailu = arvot[0];
    	for ( int i=0; i<5; i++ ) 
    	{
    		if ( arvot[i] != vertailu ) 
    		{
    			suoraArvo = EISUORA;
    			break;
    		}
    		suoraArvo = SUORA;
    		vertailu++;
    	}
    	
    	// If first item was ace #1, flip value to 14, re-sort and try.
    	
    	if (arvot[0] == 1 && suoraArvo == EISUORA)
    	{
    		arvot[0] = 14;
        	Arrays.sort(arvot);
        	vertailu = arvot[0];
        	
        	for ( int i=0; i<5; i++ ) 
        	{
        		if ( arvot[i] != vertailu ) 
        		{
        			suoraArvo = EISUORA;
        			break;
        		}
        		suoraArvo = SUORA;
        		vertailu++;
        	}
    	}
    	
    	arvo = suoraArvo + variArvo;
    	
    	return this.arvo;
    }

    // toString
    
    public String toString() 
    {
    	return(kasi[0].toString() + ", " + kasi[1].toString() + ", " + kasi[2].toString() + ", " + kasi[3].toString() + ", " + kasi[4].toString());
    }
}
