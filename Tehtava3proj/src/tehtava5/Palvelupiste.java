package tehtava5;
import java.util.LinkedList;


public class Palvelupiste {

	private LinkedList <Asiakas> asiakasjono;
	
	public Palvelupiste() 
	{
		asiakasjono = new LinkedList<Asiakas>();
	}
	
	// palvele
	
	public double palvele() 
	{
		double kaytettyaika = 0;
		int i=0;
		while(!asiakasjono.isEmpty())
		{
			kaytettyaika += poistaJonosta();
			i++;
		}
		return(kaytettyaika / i);
	}
	
	// lisaaJonoon
	
	public void lisaaJonoon(Asiakas asiakas)
	{
		asiakasjono.add(asiakas);
	}
	
	// poistaJonosta
	
	public long poistaJonosta()
	{
		Asiakas asiakas = asiakasjono.getFirst();
		asiakas.setLahtoAika(Kello.getInstance().getAika());
		System.out.println("jonossa asiakas "+ asiakas.getId() + ", aloitusaika: " + asiakas.getSaapumisAika() + ", lopetusaika:" + asiakas.getLahtoAika());
		asiakasjono.remove();
		return(asiakas.getKulutettuAika());
	}
}
