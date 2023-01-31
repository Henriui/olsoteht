package tehtava2_4;

import java.util.Scanner;

public class testi2_4 {

	public static void main(String[] args) 
	{
		Tapahtuma tapahtuma;
		boolean loop = true;
		int vastaus = 0;
		TapahtumaLista lista = new TapahtumaLista();
		while(loop)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("1: Lisaa listaan, 2: Poista listasta, 3: Printtaa lista, 0: Lopeta");
		String scanString = scan.nextLine();
		try 
		{
			vastaus = Integer.parseInt(scanString);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Ei ollut numero.");
		}
		switch(vastaus)
		{
			case 0:
				loop = !loop;
				break;
			case 1:
				System.out.println("Anna nimi");
				String nimi = scan.nextLine();

				System.out.println("Anna aika");
				scanString = scan.nextLine();
				vastaus = Integer.parseInt(scanString);

				System.out.println("Anna tyyppi Saapuminen/Poistuminen");
				String tyyppi = scan.nextLine().toUpperCase();

				tapahtuma = new Tapahtuma(nimi, vastaus, tyyppi);
				lista.addTapahtuma(tapahtuma);
				break;
			case 2:
				lista.removeTapahtuma();
				break;
			case 3:
				System.out.println(lista.toString());
				break;
			}
		}
	}
}
