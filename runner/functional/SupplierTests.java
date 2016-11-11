
package runner.functional;

import java.util.function.Predicate;
import java.util.function.Supplier;

import errors.KoanError;
import koans.functional.SupplierLambda;
import runner.KoanRunner;

public class SupplierTests implements Predicate<Supplier<Boolean>> {

	public boolean test(Supplier<Boolean> supplier) {

		return FunctionalTests.isValidLambda(supplier) && supplier.get();
	}
}
