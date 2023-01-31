import java.util.Scanner;

/**
* @author Henri Uimonen 5.9.2022
*/

public class Poikkeus {

	public static void main(String[] args) {

	    System.out.println("Tehtävä 1: Poikkeuksen testaaminen");
	    
		// Esittele tarvittavat muuttujat

		Scanner scan = new Scanner(System.in); 
		String ikastring = "";
		boolean prompt = false;
		int ika = 0;

		// Ohjelmoi try-catch-lohko 

		while(!prompt){
			prompt = true;
			System.out.println("Anna ikäsi.");
			ikastring = scan.nextLine();

			try 
			{
				ika = Integer.parseInt(ikastring);
			} 
			catch (NumberFormatException e) 
			{
			System.out.println("ei ollut numero");	
			prompt = false;	
			}


		}
		System.out.println("Vuoden päästä olet jo "+ (ika +1) +"-vuotias.");
		
	    // Kysy ikä ja lue se merkkijonomuuttujaan

	    // Tee muunnos  
		// - jos muunnos onnistuu, näytä tulos ja lopeta
		// - jos syntyy poikkeus, anna virheilmoitus
		
		// Poikkeustilanteessa ikää on kysyttävä vielä uudelleen, 
		// joten tarvitset kaiken ympärille vielä toistorakenteen 
	}
}
