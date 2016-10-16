
package errors;

/*
 * This class is a runtime error becaues users updating the Koan should not need
 * to care that this exception was thrown before.
 */
public class EmptyKoan extends RuntimeException {

	public EmptyKoan() {
		super();
	}
}
