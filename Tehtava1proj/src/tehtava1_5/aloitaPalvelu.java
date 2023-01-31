package tehtava1_5;
import asiakasjono.Asiakasgeneraattori;
import asiakasjono.Palvelupiste;

public class aloitaPalvelu {

	public static void main(String[] args) {
		final int maara = 20;
		Palvelupiste palvelupiste = new Palvelupiste();
		Asiakasgeneraattori gene = new Asiakasgeneraattori(palvelupiste);
		
		gene.luoAsiakkaita(maara);
		double keskiarvo = palvelupiste.palvele();
		
		System.out.printf("Palveltuja asiakkaita: %d Palvelun keskiarvo aika: %.2f",maara ,keskiarvo);
		

	}

}
