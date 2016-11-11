
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

	public <T> void test(Koan<T> koan, Predicate<T> func) throws KoanError {

		try {
			T answer = koan.get();
			if (func.test(answer) == false) {
				throw new KoanError(koan, "Incorrect answer");
			}
		} catch (EmptyKoan e) {
			throw e;
		} catch (Exception e) {
			throw new KoanError(koan, "Incorrect answer");
		}
	}

	public <T, U> void test(StatefulKoan<T, U> koan, BiPredicate<T, U> func) throws KoanError {

		try {
			T answer = koan.get();
			U state = koan.getState();
			if (func.test(answer, state) == false) {
				throw new KoanError(koan, "Incorrect answer");
			}
		} catch (EmptyKoan e) {
			throw e;
		} catch (Exception e) {
			throw new KoanError(koan, "Incorrect answer");
		}
	}
}
