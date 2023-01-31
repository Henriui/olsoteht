package application;

import entity.*;
import dao.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FirmaJpaApp {

    public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

    	TyöntekijäDao ttdao = new TyöntekijäDao();
    	TyöhuoneDao thdao = new TyöhuoneDao();
    	ProjektiDao Pdao = new ProjektiDao();
    	
		Date date1 = new Date();
    	String tempdate = "20-20-2022";
    	Date date2 = null;
		try {
			date2 = formatter.parse(tempdate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	Projekti projekti = new Projekti(1, "Testi", date1, date2);
    	Työhuone työhuone = new Työhuone(1,12);
    	
    	boolean lopetus = false;
    	Scanner sc = new Scanner(System.in);
    	
    	while (!lopetus) {
			System.out.println("1. Lisää työntekijä\n2. Hae työntekijä\n3. Muokkaa nimeä\n4. Poista työntekijä\n5. Luo työhuone\n"
			+ "6. Luo projekti \n7. Anna projekti työntekijälle \n8. Testaa kaikkea. \n0. Lopeta");
			int valinta = sc.nextInt(); sc.nextLine();
    		int numero, huonenumero, kapasiteetti, projektinumero;
    		String etunimi, sukunimi;
    		switch(valinta) {
    			case 1:
    				System.out.println("Syötä etunimi:");
    				etunimi = sc.nextLine();
    				System.out.println("Syötä sukunimi:");
    				sukunimi = sc.nextLine();    				
					System.out.println("Syötä huonenumero:");
    				String huone = sc.nextLine();
    				huonenumero = Integer.parseInt(huone);
    				Työhuone tila = thdao.haeTyöhuone(huonenumero);
    				
    				System.out.println("Syötä projektinumero:");
    				String pro = sc.nextLine();
    				projektinumero = Integer.parseInt(huone);
    				Projekti työ = Pdao.haeProjekti(projektinumero);
    				ttdao.lisääTyöntekijä(new Työntekijä(etunimi, sukunimi, tila, työ));
    				break;
    			case 2:
    				System.out.println("Syötä työntekijänumero:");
    				numero = sc.nextInt(); sc.nextLine();
    				System.out.println(ttdao.haeTyöntekijä(numero));
    				break;
    			case 3:
    				System.out.println("Syötä työntekijänumero:");
    				numero = sc.nextInt(); sc.nextLine();
    				System.out.println("Syötä etunimi:");
    				etunimi = sc.nextLine();
    				System.out.println("Syötä sukunimi:");
    				sukunimi = sc.nextLine();
    				ttdao.muutaNimi(numero, etunimi, sukunimi);
    				break;
    			case 4:
    				System.out.println("Syötä työntekijänumero:");
    				numero = sc.nextInt(); sc.nextLine();
    				ttdao.poistaTyöntekijä(numero);
    				break;
    			case 0:
    				lopetus = true;
    				break;
					case 7:
    				System.out.println("Syötä projektin numero:");
    				int hae = sc.nextInt();sc.nextLine();
    				
    				System.out.println("Syötä työntekijänumero:");
    				numero = sc.nextInt(); sc.nextLine();
    				Projekti annaProjekti = Pdao.haeProjekti(hae);
    				Työntekijä henkilo = ttdao.haeTyöntekijä(numero);
    				henkilo.annaProjekti(annaProjekti);
    				break;
    			case 8:
    				Työhuone työhuone2 = new Työhuone(1,12);
    				Työhuone työhuone1 = new Työhuone(3,7);
    				Projekti projekti1 = new Projekti(6, "Testi1", date1, date2);
    				Projekti projekti2 = new Projekti(7, "Testi2", date1, date2);
    				Pdao.lisääProjekti(projekti1);
    				Pdao.lisääProjekti(projekti2);
    				thdao.lisääTyöhuone(työhuone1);
    				thdao.lisääTyöhuone(työhuone2);
    				ttdao.lisääTyöntekijä(new Työntekijä("joni", "borman", työhuone1, projekti1));
    				ttdao.lisääTyöntekijä(new Työntekijä("ramus", "rammus", työhuone2, projekti2));
    			
    				Työntekijä työntekijä = ttdao.haeTyöntekijä(1);
    				työntekijä.annaProjekti(projekti2);
    				työntekijä.tulostaTiedot();
    				break;
    			default:
    				System.out.println("Virheellinen valinta.");
    		}
    	
    	}
    }
}
