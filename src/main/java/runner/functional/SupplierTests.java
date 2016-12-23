
package runner.functional;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierTests implements Predicate<Supplier<Boolean>> {

	public boolean test(Supplier<Boolean> supplier) {

		return FunctionalUtils.isLambda(supplier) && supplier.get();
	}
}
