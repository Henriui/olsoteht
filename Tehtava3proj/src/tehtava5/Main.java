package tehtava5;

import eduni.distributions.Normal;

public class Main {

	public static void main(String[] args) {
		TapahtumaLista lista = new TapahtumaLista();
		Normal normal = new Normal(5, 10);
		Saapumisprosessi saap = new Saapumisprosessi(lista, normal);
		Palvelupiste piste = new Palvelupiste();
		Kello kello = Kello.getInstance();

		for (int i=0;i<10;i++){
			saap.luoTapahtuma();
		
		}

		while(!lista.isEmpty()){
			Asiakas asiakas = new Asiakas();
			Tapahtuma tapahtuma = lista.removeTapahtuma();
			asiakas.setSaapumisaika(tapahtuma.getAika());
			piste.lisaaJonoon(asiakas);
		}
		kello.setAika(kello.getAika() + 5);
		Double keskaika = piste.palvele();

		System.out.println(keskaika + " keskimääräinen palveluaika");
	}

}
