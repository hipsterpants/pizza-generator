package pizzagenerator;

import java.util.Random;

public class Randomizer {
	Random rand = new Random();
	
	public Randomizer() {
		
	}
	
	public int generateRandomNum(int limit) {
		return rand.nextInt((limit - 1) + 1) + 1;
	}
	
	public int[] generateRandomNumArray(int limit, int arraySize) {
		int[] randomNumArray = new int[arraySize];
		for (int i = 0; i < randomNumArray.length; i++) {
			randomNumArray[i] = rand.nextInt((limit - 1) + 1) + 1;
		}
		return randomNumArray;
	}

}
