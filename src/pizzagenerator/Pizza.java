package pizzagenerator;

public class Pizza {
	
	private String size;
	private int numToppings;
	private String typeCrust;
	private String[] toppings;
	//create Map of numbers to toppings, use that to determine toppings of pizza
	
	public Pizza() {
		
	}
	
	public void setSize(int rand) {
		if (rand == 1) {
			size = "Small";
		} else if (rand == 2){
			size = "Medium";
		} else if (rand == 3) {
			size = "Large";
		} else if (rand == 4) {
			size = "Extra Large";
		}
	}
	
	public void setNumToppings(int rand) {
		numToppings = rand;
	}
	
	public void setTypeCrust(int rand) {
		if (rand == 1) {
			typeCrust = "Thin";
		} else if (rand == 2) {
			typeCrust = "Thick";
		} else if (rand == 3) {
			typeCrust = "Brooklyn Style";
		} else if (rand == 4) {
			typeCrust = "Chicago Style";
		}
	}
	
	public void setToppingsSize() {
		toppings = new String[numToppings];
	}
	
	
	public void setToppings(int[] randArray) { //HashMap would be more efficient
		for (int i = 0; i < randArray.length; i++) {
			if (randArray[i] == 1) {
				toppings[i] = "Pepperoni";
			} else if (randArray[i] == 2) {
				toppings[i] = "Anchovies";
			} else if (randArray[i] == 3) {
				toppings[i] = "Pineapple";
			} else if (randArray[i] == 4) {
				toppings[i] = "Sausage";
			} else if (randArray[i] == 5) {
				toppings[i] = "Bacon";
			} else if (randArray[i] == 6) {
				toppings[i] = "Mushrooms";
			}
		}
	}
	
	
	public String getSize() {
		return size;
	}
	
	public int getNumToppings() {
		return numToppings;
	}
	
	public String getTypeCrust() {
		return typeCrust;
	}
	
	public String[] getToppings() {
		return toppings;
	}
	

}
