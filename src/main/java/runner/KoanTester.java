
package runner;

import java.lang.FunctionalInterface;
import java.util.function.Predicate;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

import koans.Koan;
import koans.StatefulKoan;
import errors.KoanError;
import errors.EmptyKoan;

public class KoanTester {

	private static final String FAILED_MESSAGE = "Incorrect answer";

	public <T> void test(Koan<T> koan, Predicate<T> func) throws KoanError {

		T answer = koan.answer();
		if (func.test(answer) == false) {
			throw new KoanError(koan);
		}
	}

	public <T, U> void test(StatefulKoan<T, U> koan, BiPredicate<T, U> func) throws KoanError {

		T answer = koan.answer();
		U state = koan.getState();
		if (func.test(answer, state) == false) {
			throw new KoanError(koan);
		}
	}
}
