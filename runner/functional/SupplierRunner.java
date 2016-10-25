
package runner.functional;

import java.util.function.Supplier;

import errors.KoanError;
import koans.functional.SupplierLambda;
import runner.KoanRunner;

public class SupplierRunner implements KoanRunner {

	public void run() throws KoanError {

		SupplierLambda	koan = new SupplierLambda();

		Supplier<Boolean> supplier = koan.getSupplierLambda();

		FunctionalHelper.validateLambda(koan, supplier);

		if (!supplier.get()) {
			throw new KoanError(koan, "Lambda worker should report that it is finished.");
		}
	}
}
