import pokerikadet.Kasi;
import pokerikadet.Pakka;

/**
* Kevät 2022
* @author Henri Uimonen 22.8.2022
*/

public class Main {

    public static void main(String[] args) {
    	int    arvo;
    	String arvoString = "NULL";
    	int    kierros = 0;
    	// Luo pakka
    	Pakka pakka = new Pakka();
    	do {
    	// Sekoita pakka
    	pakka.sekoita();
    	// Jaa käsi
    	Kasi kasi = new Kasi(pakka);
    	// Näytä (tulosta) käsi
    	System.out.println(kasi.toString());
    	// Tarkasta onko väri
    	arvo = kasi.annaArvo();
    	System.out.println(kasi.annaArvo());
    	kierros++;
    	}
    	while (arvo < 1);
    	
    	switch (arvo) 
    		{
    	case 1:
    		arvoString = "Suora";
    		break;
    	case 2:
    		arvoString = "Väri";
    		break;
    	case 3:
    		arvoString = "Värisuora";
    		break;
    		}
    	
    	System.out.println(kierros + " kierrosta. Tulos: " + arvoString);
    }
}