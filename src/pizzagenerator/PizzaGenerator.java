package pizzagenerator;

import java.util.Scanner;

public class PizzaGenerator {

	public static void main(String[] args) {
		System.out.println("Welcome to the Pizza Generator V1.");
		Randomizer randomizer = new Randomizer();
		Pizza pizza = new Pizza();
		pizza.setSize(randomizer.generateRandomNum(4));
		pizza.setNumToppings(randomizer.generateRandomNum(6));
		pizza.setTypeCrust(randomizer.generateRandomNum(4));
		pizza.setToppingsSize();
		int pizzaNumToppings = randomizer.generateRandomNum(6);
		pizza.setToppings(randomizer.generateRandomNumArray(6, pizzaNumToppings));
		System.out.println("You generated a " + pizza.getSize() + " pizza with "
				+ pizza.getTypeCrust() + " crust. With the toppings:");
		String[] pizzaToppings = pizza.getToppings();
		for (int i = 0; i < pizzaNumToppings; i++) {
			System.out.println(pizzaToppings[i]);
		}

	}

}
