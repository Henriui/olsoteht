package asiakasjono;

public class Asiakasgeneraattori {
	
	Palvelupiste palvelupiste;
	
	public Asiakasgeneraattori(Palvelupiste palvelupiste) 
	{
		this.palvelupiste = palvelupiste;
	}
	
	public void luoAsiakkaita(int maara){
		int id = 1;
		for (; id<=maara; id++) 
		{
			Asiakas asiakas = new Asiakas(id);
			palvelupiste.lisaaJonoon(asiakas);
		}
	}
}
