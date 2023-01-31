import java.util.HashMap;
import java.util.Random;

public class teht2_3 {
	public static void main(String args[])
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		Random rand = new Random();
		int randNum;

		// Alusta hashmap.

		map.put(20, 0); // 15%
		map.put(21, 0); // 20%
		map.put(22, 0); // 25%
		map.put(23, 0); // 25%
		map.put(24, 0); // 15%

		// Iteroi 1000 luokkalaista.

		for (int i=0; i<1000; i++) 
		{
			randNum = rand.nextInt(100);
			randNum++;
			if (randNum > 0 && randNum <= 15 )
				map.put(20, map.get(20) + 1);

			else if (randNum > 0 && randNum <= 35 )
				map.put(21, map.get(21) + 1);

			else if (randNum > 35 && randNum <= 60 )
				map.put(22, map.get(22) + 1);

			else if (randNum > 60 && randNum <= 85 )
				map.put(23, map.get(23) + 1);

			else if (randNum > 85 && randNum <= 100 )
				map.put(24, map.get(24) + 1);
		}
		int value = 20;

		// Printtaa tulokset

		for (Integer x : map.keySet()) 
		{
			System.out.println(value + " ikaisia on " + map.get(value));
			value++;
		}
	}
	
}
