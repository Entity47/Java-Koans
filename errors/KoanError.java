
package errors;

public class KoanError extends Exception {

	private static final String ERROR_MESSAGE = "Incorrect answer.";

	private String koan;

	public KoanError(Object koan) {
		super(ERROR_MESSAGE);
		this.koan = koan.getClass().getName();
	}

	public KoanError(Object koan, Exception nested) {
		super(ERROR_MESSAGE, nested);
		this.koan = koan.getClass().getName();
	}

	public String getKoan() {
		return this.koan;
	}

}
