package valtiot;

/**
* @author Henri Uimonen 5.9.2022
*/

import java.util.HashMap;
import java.util.Scanner;

public class ValtioMain {

	public static void main(String[] args) {

		// Valtioiden käsittelyssä tarvittavat muuttujat ja
		// HashMap-olio Valtio-olioiden tallentamiseksi.
		
		Valtio valtio;
		String nimi;
		String pääkaupunki;
		int asukasluku = 0;
		HashMap<String, Valtio> valtiot;
		final String TIEDOSTONIMI = "valtiot.dat";
		
		Scanner näppis = new Scanner(System.in);
		
		// Jos tiedosto on olemassa, lue HashMap sieltä 
		valtiot = TiedostonKasittely.lueTiedosto(TIEDOSTONIMI);
		if (valtiot == null) {
			valtiot = new HashMap<>();
		}
		
		
		// Lue valtioiden tietoja ja lisää valtioita HashMapiin, 
		// kunnes syötteenä annetaan tyhjä 

		do {
			String asukaslukuString;

			System.out.println("Anna nimi.");
			nimi = näppis.nextLine();
			
			if (nimi.length() == 0)
				break;

			System.out.println("Anna pääkaupunki.");
			pääkaupunki = näppis.nextLine();

			if (pääkaupunki.length() == 0)
				break;

			boolean prompt = false;

			while(!prompt)
			{
				prompt = true;

				System.out.println("Anna asukasluku.");
				asukaslukuString = näppis.nextLine();

				if (asukaslukuString.length() == 0)
					break;

				try 
				{
					asukasluku = Integer.parseInt(asukaslukuString);
				} 
				catch (NumberFormatException e) 
				{
					prompt = false;
					System.out.println("ei ollut numero.");
				}
			}
			valtiot.put(nimi, new Valtio(nimi, pääkaupunki, asukasluku));

		} while (nimi.length() != 0);
		
        // Tulosta HashMapin sisältö, käytä for-each- rakennetta.

		System.out.println("HashMapissa nyt seuraavat valtiot:");
		for (Valtio asd : valtiot.values()) 
		{
				System.out.println(asd);
		}
		// Kirjoita HashMap tiedostoon
		TiedostonKasittely.kirjoitaTiedosto(TIEDOSTONIMI, valtiot);
	}
}


