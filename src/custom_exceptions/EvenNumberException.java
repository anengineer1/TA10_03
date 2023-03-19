package custom_exceptions;

public class EvenNumberException extends Exception {

	@Override
	public String getMessage() {

		return "Es par";
	}
}
