
package koans.functional;

import java.util.function.Function;

import errors.EmptyKoan;
import koans.Koan;

public class FunctionLambda extends Koan<Function<Integer,Boolean>> {

	public Function<Integer,Boolean> answer() {

		/*
		 * Return a lambda function that implements the Function interface,
		 * accepts an integer, and returns whether or not the integer was even.
		 */
		throw new EmptyKoan();
	}
}
