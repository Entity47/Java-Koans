
package errors;

public class KoanError extends Exception {

	private String koan;

	public KoanError(Object koan, String message) {
		super(message);
		this.koan = koan.getClass().getName();
	}

	public String getKoan() {
		return this.koan;
	}

}
