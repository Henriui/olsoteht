 
import java.util.Scanner;
import model.*;

public class TekstiMain {
	static IValuuttaDAO valuuttaDAO = new ValuuttaAccessObject();
	static Scanner scanner = new Scanner(System.in);
	private static ValuuttaAccessObject valuuttadb;

	public static void listaaValuutat() {
		Valuutta[] valuutat = valuuttaDAO.readValuutat();
		for (Valuutta valuutta : valuutat) {
			System.out.println(valuutta.toString());
		}
	}

	public static void lisääValuutta(Valuutta valuutta) {
		valuuttaDAO.createValuutta(valuutta);
	}

	public static void päivitäValuutta(Valuutta valuutta) {
		valuuttaDAO.updateValuutta(valuutta);
	}

	public static void poistaValuutta(String tyyppi) {
		valuuttaDAO.deleteValuutta(tyyppi);
	}

	public static void main(String[] args) {
		char valinta;
		Valuutta valuutta;
		final char CREATE = 'C', READ = 'R', UPDATE = 'U', DELETE = 'D', QUIT = 'Q';
		
		do {
			valinta = (scanner.nextLine().toUpperCase()).charAt(0);
			switch (valinta) {
			case READ:
				listaaValuutat();
				break;
			case CREATE:
			valuutta = valuuttaKysely();
				lisääValuutta(valuutta);
				break;
			case UPDATE:
			valuutta = valuuttaKysely();
				päivitäValuutta(valuutta);
				break;
			case DELETE:
				poistaValuutta(tyyppikysely());
				break;
			}
		} while (valinta != QUIT);

		valuuttadb.closeDbConnection();
	}

	private static String tyyppikysely() {
		System.out.println("Anna tunnus");
		String tunnus = scanner.nextLine().toUpperCase();
		return tunnus;
	}

	private static Valuutta valuuttaKysely() {
		String tunnus, nimi;
		double vaihtokurssi;
		System.out.println("Anna tunnus");
		tunnus = scanner.nextLine().toUpperCase();
		System.out.println("Anna vaihtokurssi");
		vaihtokurssi =	Double.parseDouble(scanner.nextLine());
		System.out.println("Anna nimi");
		nimi = scanner.nextLine();

		Valuutta valuutta = new Valuutta(tunnus, vaihtokurssi, nimi);
		return valuutta;
	}
}
