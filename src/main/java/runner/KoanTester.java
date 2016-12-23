
package runner;

import errors.KoanError;
import koans.Koan;
import koans.StatefulKoan;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class KoanTester {

	private static final String FAILED_MESSAGE = "Incorrect answer";

	public <KoanResponse> void test(Koan<KoanResponse> koan, Predicate<KoanResponse> func) throws KoanError {

		KoanResponse answer = koan.answer();
		if (func.test(answer) == false) {
			throw new KoanError(koan);
		}
	}

	public <KoanResponse, KoanState> void test(StatefulKoan<KoanResponse, KoanState> koan,
											   BiPredicate<KoanResponse, KoanState> func) throws KoanError {

		KoanResponse answer = koan.answer();
		KoanState state = koan.getState();
		if (func.test(answer, state) == false) {
			throw new KoanError(koan);
		}
	}
}
