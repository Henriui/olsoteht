package asiakasjono;

import java.util.LinkedList;

public class Jono {
	private LinkedList<Asiakas> asiakasJono;

	// Jono
	
	public Jono() 
	{
		asiakasJono = new LinkedList<Asiakas>();
	}
	
	// lisaaJonoon
	
	public void lisaaJonoon(Asiakas asiakas)
	{
		asiakas.setSaapumisaika(System.nanoTime());
		asiakasJono.addLast(asiakas);
	}
	
	// poistaJonosta
	
	public long poistaJonosta()
	{
		Asiakas jonostaPois = asiakasJono.getFirst();
		jonostaPois.setLahtoAika(System.nanoTime());
		asiakasJono.removeFirst();
		return(jonostaPois.getKulutettuAika());
	}
	
	public int getEkanId() 
	{
		return(asiakasJono.getFirst().getId());
	}
}
