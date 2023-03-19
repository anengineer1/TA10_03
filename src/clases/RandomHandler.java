package clases;

import java.util.Random;

public class RandomHandler {

	private int random_number;

	public RandomHandler() {
		System.out.println("Generando número aleatorio...");
		this.random_number = genRandom();
		System.out.println("El número aleatorio generado es: " + getRandom_number());
	}

	private int genRandom() {
		Random rnd = new Random();
		return rnd.nextInt(1000); // 1000 Because the upper value is not inclusive
	}

	public int getRandom_number() {
		return random_number;
	}

	public boolean isEven() {
		return ((this.random_number % 2) == 0);
	}
	
}
