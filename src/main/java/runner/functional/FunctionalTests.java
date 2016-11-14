
package runner.functional;

import errors.KoanError;
import koans.Koan;

public class FunctionalTests {

	public static <T> boolean isValidLambda(T obj) {

		return obj.getClass().getName().contains("$$Lambda");
	}
}
