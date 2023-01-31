 
import java.util.Scanner;

import entity.Valuutta;
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

	public static void lueValuutta(String tunnus) {
		valuuttaDAO.readValuutta(tunnus);
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
		final char CREATE = 'C', READ = 'R', UPDATE = 'U', DELETE = 'D', QUIT = 'Q', TEST = 'T', ALL = 'A';
		
		do {
			valinta = (scanner.nextLine().toUpperCase()).charAt(0);
			switch (valinta) {
			case ALL:
				listaaValuutat();
				break;
			case READ:
				lueValuutta(tyyppikysely());
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
			case TEST:
				testaaValuutat();
				break;
			}
		} while (valinta != QUIT);

	}

	private static void testaaValuutat() {
		Valuutta valuutta1 = new Valuutta("XYZ", 1.44, "Kolmivaluutta");
		Valuutta valuutta2 = new Valuutta("ABC", 1.44, "Aakkosvaluutta");

		lisääValuutta(valuutta1);
		listaaValuutat();
		lisääValuutta(valuutta2);
		listaaValuutat();
		
		System.out.println("Poistetaan XYZ");
		poistaValuutta("XYZ");
		listaaValuutat();

		System.out.println("Päivitetään ABC nimi ja vaihtokurssi");
		valuutta2.setNimi("ABC asemien valuutta"); valuutta2.setVaihtokurssi(55.55);
		päivitäValuutta(valuutta2);
		listaaValuutat();		
		poistaValuutta("ABC");

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
