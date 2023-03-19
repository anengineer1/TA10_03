package custom_exceptions;

public class OddNumberException extends Exception {

	@Override
	public String getMessage() {

		return "Es impar";
	}
}
