/**
* @author Henri Uimonen 5.9.2022
*/

import java.io.*;

public class PerusTyypitettyIO {

	public static void kirjoita(int luvut[], String tiedosto) 
	{
		FileOutputStream fileOut = null;
		DataOutputStream dataOut = null;

		// TODO: täydennä

		try 
		{
			fileOut = new FileOutputStream(tiedosto);
			dataOut = new DataOutputStream(fileOut);

			for (int i : luvut) {
				dataOut.writeInt(i);
			}

			System.out.println("Tiedot tallennettu tiedostoon " + tiedosto);
		} 
		catch (Exception ex)
		{
			System.out.println(tiedosto + "-tiedostoon tallentaminen ei onnistunut");
		}

	}

	public static int kerroKoko(String tiedosto) {
		FileInputStream f = null;

		// TODO: täydennä
		int available = 0;
		try 
		{
			f = new FileInputStream(tiedosto);

			available = f.available();
		} 
		catch (IOException ex)
		{
			System.out.println("Lukuvirhe");
		}
		return available;
	}

	public static byte[] annaTavuina(String tiedosto) {
		FileInputStream f = null;

		// TODO: täydennä
		byte[] baitti = null;
		try 
		{
			f = new FileInputStream(tiedosto);

			baitti = f.readAllBytes();
			f.close();
		} 
		catch (IOException ex)
		{
			System.out.println("Lukuvirhe");
		}
		return baitti;
	}

	public static int[] annaKokonaislukuina(String tiedosto) {
		FileInputStream f = null;
		DataInputStream din = null;
		int[] luvut = {0,0,0,0,0};
		try 
		{
			f = new FileInputStream(tiedosto);
			din = new DataInputStream(f);
			int i = 0;
			while (f.available() > 0) {
					luvut[i] = din.readInt();
					System.out.println(luvut[i]);
					i++;
			}
			
			System.out.println("Tiedot luettu.");
		} 
		catch (IOException ex)
		{
			System.out.println("Lukuvirhe");
		}
		return luvut;
	}


	public static void main(String args[]) {
		String tiedosto = "Luvut.bin";
		int luvut[] = { 1, 200, 3, 4, 5 };
		byte tavut[];
		int iLuvut[];

		kirjoita(luvut, tiedosto);

		System.out.println("Tiedostossa on " + kerroKoko(tiedosto) + " tavua");

		System.out.println ("Tiedoston sisältö tavuittain:");
		tavut = annaTavuina(tiedosto);
		for (int i = 0; i < tavut.length; i++) {
			System.out.print(tavut[i] + " ");
		}

		System.out.println ("\nTiedoston sisältö kokonaislukuina:");
		iLuvut = annaKokonaislukuina(tiedosto);
		for (int i = 0; i < iLuvut.length; i++) {
			System.out.print(iLuvut[i] + " ");
		}
	}

}
