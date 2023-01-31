package tehtava5;

public class Asiakas {
	private static int nextid = 0;
	private int id;
	private long saapumisAika;
	private long lahtoAika;
	
	// Asiakas
	
	public Asiakas () 
	{
		nextid++;
		id = nextid;
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
