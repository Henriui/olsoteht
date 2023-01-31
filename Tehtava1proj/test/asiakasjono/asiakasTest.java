package asiakasjono;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.DisplayName;


class asiakasTest {

	Asiakas asiakas;
	@AfterEach
	void tulostaId() 
	{
		System.out.println(asiakas.getId());
	}
	
	@Test
	@Order(1)
	@DisplayName("Asiakkaan luonti test")
	public void luoAsiakas() 
	{
		asiakas = new Asiakas(5);
		int expect = 5;
		assertEquals(asiakas.getId(), expect, "Piti olla 5");
	}
	
	@Test
	@Order(2)
	@DisplayName("Saapumisaika test")
	public void saapumisaikaTest() 
	{
		asiakas = new Asiakas(1);
		long expect = System.nanoTime();
		asiakas.setSaapumisaika(expect);
		assertEquals(asiakas.getSaapumisAika(), expect, "Piti olla " + expect);
	}
	
	@Test
	@Order(3)
	@DisplayName("Lahtoaika test")
	public void lahtoaikaTest() 
	{
		asiakas = new Asiakas(1);
		long expect = System.nanoTime();
		asiakas.setLahtoAika(expect);
		assertEquals(asiakas.getLahtoAika(), expect, "Piti olla " + expect);
	}
	
	@Test
	@Order(4)
	@DisplayName("Lahtoaika test")
	public void kulutettuAikaTest() 
	{
		asiakas = new Asiakas(1);
		long time = System.nanoTime();
		asiakas.setSaapumisaika(time);
		asiakas.setLahtoAika(time*2);
		long expect = asiakas.getLahtoAika() - asiakas.getSaapumisAika() ;
		assertEquals(asiakas.getKulutettuAika(), expect, "Piti olla " + expect);
	}

}
