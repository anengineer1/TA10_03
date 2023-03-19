package main;

import clases.RandomHandler;
import custom_exceptions.EvenNumberException;
import custom_exceptions.OddNumberException;

public class TA10_03_App {
	public static void main(String[] args) {
		RandomHandler random_number = new RandomHandler();
		
		try {
			
			if (random_number.isEven()) {
				throw new EvenNumberException();
			} else {
				throw new OddNumberException();
			}
			
		} catch (OddNumberException e) {
			System.out.println(e.getMessage());
		} catch (EvenNumberException e) {
			System.out.println(e.getMessage());
		}
	}

}
