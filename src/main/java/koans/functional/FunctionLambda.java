
package koans.functional;

import errors.EmptyKoan;
import koans.Koan;

import java.util.function.Function;

public class FunctionLambda implements Koan<Function<Integer,Boolean>> {

	public Function<Integer,Boolean> answer() {

		/*
		 * Return a lambda function that implements the Function interface,
		 * accepts an integer, and returns whether or not the integer was even.
		 */
		throw new EmptyKoan();
	}
}
