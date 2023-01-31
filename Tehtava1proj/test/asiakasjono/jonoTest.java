package asiakasjono;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
/*
*
* @author Henri Uimonen, 25.8.2022
*/
class jonoTest {

	
	private Jono jono = new Jono();
	// Lisää 5 asiakasta.
	@BeforeEach
	public void oletusAsiakkaat() {
		for ( int id = 1;id<=5; id++ ) 
		{
			Asiakas asiakas = new Asiakas(id);
			jono.lisaaJonoon(asiakas);
		}
	}
	
	@AfterEach
	public void tulostaId() 
	{
		System.out.println(jono.getEkanId());
	}

	@Test
	@Order(1)
	@DisplayName("Jonon eka")
	public void testJononEka()
	{
		System.out.print("Jonon eka test");
		int expectedEka = 1;
		assertEquals(jono.getEkanId(), expectedEka, "Piti olla 1");
		System.out.println("  -Ok");
	}
	
	@Test
	@Order(2)
	@DisplayName("Jonon vika")
	public void testJonostaPoisto()
	{
		System.out.print("Jonon vika test");
		int expectedEka = 5;
		for (int i= 0; i<4; i++)
			jono.poistaJonosta();
		
		assertEquals(jono.getEkanId(), expectedEka, "Piti olla 5");
		System.out.println("  -Ok");

	}
}
