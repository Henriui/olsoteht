package asiakasjono;

public class Asiakas {
	private int id;
	private long saapumisAika;
	private long lahtoAika;
	
	// Asiakas
	
	public Asiakas (int id) 
	{
		this.id = id;
	}
	
	// setSaapumisAika
	
	public void setSaapumisaika(long saapumisAika) 
	{
		this.saapumisAika = saapumisAika;
	}
	
	// setLahtoAika
	
	public void setLahtoAika(long lahtoAika) 
	{
		this.lahtoAika = lahtoAika;
	}
	
	// getSaapumisAika
	
	public long getSaapumisAika() 
	{
		return(this.saapumisAika);
	}
	
	// getLahtoAika
	
	public long getLahtoAika() 
	{
		return(this.lahtoAika);
	}
	
	// getKulutettuAika
	
	public long getKulutettuAika() 
	{
		long kulutettuaika = lahtoAika - saapumisAika;
		return(kulutettuaika);
	}
	
	// getId
	
	public int getId() 
	{
		return(this.id);
	}
}
