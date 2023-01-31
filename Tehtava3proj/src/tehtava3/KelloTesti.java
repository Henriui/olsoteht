package tehtava3;

public class KelloTesti {

	public static void main(String[] args) {
		Kello kello = Kello.getInstance();

		kello.setAika(10);
		System.out.println(kello.getAika());

	}

}
