 
import java.util.Scanner;
import model.*;

public class TekstiMain {
	static IValuuttaDAO valuuttaDAO = new ValuuttaAccessObject();
	static Scanner scanner = new Scanner(System.in);

	public static void listaaValuutat() {

	}

	public static void lisääValuutta() {

	}

	public static void päivitäValuutta() {

	}

	public static void poistaValuutta() {

	}

	public static void main(String[] args) {
		char valinta;
		final char CREATE = 'C', READ = 'R', UPDATE = 'U', DELETE = 'D', QUIT = 'Q';

		do {
			valinta = (scanner.nextLine().toUpperCase()).charAt(0);
			switch (valinta) {
			case READ:
				listaaValuutat();
				break;
			}
		} while (valinta != QUIT);
	}
}
