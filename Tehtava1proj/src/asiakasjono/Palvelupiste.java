package asiakasjono;
import java.util.LinkedList;
import java.util.Random;


public class Palvelupiste {

	private LinkedList <Asiakas> asiakasjono;
	
	public Palvelupiste() 
	{
		asiakasjono = new LinkedList<Asiakas>();
	}
	
	// palvele
	
	public double palvele() 
	{
		Random rand = new Random();
		double kaytettyaika = 0;
		int i;
		int jononkoko = asiakasjono.size();
		for (i=0; i<jononkoko; i++) 
		{
			Asiakas asiakas = asiakasjono.getFirst();
			System.out.println("jonossa asiakas "+ asiakas.getId() );
			asiakas.setSaapumisaika(System.nanoTime()/1_000_000_000);
			try 
			{
				Thread.sleep(rand.nextInt(3000));
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			kaytettyaika += poistaJonosta();
		}
		return(kaytettyaika = kaytettyaika / (1+i));
	}
	
	// lisaaJonoon
	
	public void lisaaJonoon(Asiakas asiakas)
	{
		asiakasjono.addLast(asiakas);
	}
	
	// poistaJonosta
	
	public long poistaJonosta()
	{
		Asiakas jonostaPois = asiakasjono.getFirst();
		jonostaPois.setLahtoAika(System.nanoTime()/1_000_000_000);
		asiakasjono.removeFirst();
		return(jonostaPois.getKulutettuAika());
	}
}
