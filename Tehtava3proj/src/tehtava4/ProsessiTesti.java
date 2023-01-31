package tehtava4;

import eduni.distributions.Normal;

public class ProsessiTesti {

	public static void main(String[] args) {
		TapahtumaLista lista = new TapahtumaLista();
		Normal normal = new Normal(5, 10);
		Saapumisprosessi saap = new Saapumisprosessi(lista, normal);

		for (int i=0;i<10;i++){
			saap.luoTapahtuma();
		}

		System.out.println(lista.toString());
		System.out.println(Kello.getInstance().getAika());

	}

}
