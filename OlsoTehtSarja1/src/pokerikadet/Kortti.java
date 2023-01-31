package pokerikadet;
/**
*
* @author Henri Uimonen 22.8.2022
*/
public class Kortti {
    final static 	 String[] MAAT = {"Hertta", "Ruutu", "Risti", "Pata"};
    final static int HERTTA = 0, RUUTU = 1, RISTI = 2, PATA = 3;
    private int 	 arvo, maa;
    
    // Ylläolevien näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista muodossa Luokka.tunnus, esim.  Kortti.HERTTA

    // Esittele instanssimuuttujat kortin maan ja arvon tallettamiseksi
    // Kirjoita kahden parametrin konstruktori
    public Kortti(int maa, int arvo ) 
    {
    	this.maa = maa;
    	this.arvo = arvo;
    }

    // getMaa
    
    public int getMaa()
	{
    	return this.maa;
	}
    
    // getArvo
    
	public int getArvo() 
	{
		return this.arvo; 
	}
    // toString()
	
    public String toString() 
    {
    	if ( maa > 4 && maa < 0 )
    		return "EINVAL";
    	
    	return MAAT[maa] + " " + arvo;
		
    }
}
