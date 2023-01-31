package tehtava1_4;
import asiakasjono.Asiakas;
import asiakasjono.Jono;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Jono jono = new Jono();
		Scanner scan = new Scanner(System.in);
		int id = 1;
		int vastaus = 1;
		int asiakkaanId = 0;
		long poistumisAika = 0;
		
		// Skannaa vastaus asiakasmäärään.
		
		while (vastaus != 0) 
		{
			System.out.println("Kuinka monta asiakasta palvelet? (0 lopettaa)");
			String scanString = scan.nextLine();
			try 
			{
				vastaus = Integer.parseInt(scanString);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Ei ollut numero.");
			}
			break;
		}
		
		// Lisää skannatut asiakkaat jonoon.
		
		for ( ;id<=vastaus; id++ ) 
		{
			Asiakas asiakas = new Asiakas(id);
			jono.lisaaJonoon(asiakas);
			System.out.println(asiakas.getId() + "lisatty jonoon");
		}
		
		// Skannaa milloin käyttäjä vapauttaa asiakkaat jonosta.
		int asiakasnumero = 1;
		
		while (asiakasnumero < id)
		{
			System.out.println("0 lopettaa, 1 vapauttaa asiakkaan jonosta");
			String scanString = scan.nextLine();
			try 
			{
				vastaus = Integer.parseInt(scanString);
			}
			catch(NumberFormatException e)
			{
				System.out.println("Ei ollut numero.");
			}

			if ( vastaus == 0 )
				break;
			
			else if ( vastaus == 1 )
			{
				asiakkaanId = jono.getEkanId();
				poistumisAika = jono.poistaJonosta();
			}
			else
			{
				System.out.println("Ei sopiva numero");
				continue;
			}
			System.out.println("Asiakas " + asiakkaanId + " poistui ajalla " + poistumisAika);
			asiakasnumero++;
			if ( asiakasnumero >= id )
			{
				System.out.println("Viimeinen asiakas palveltu.");
			}
		}
	}
}
