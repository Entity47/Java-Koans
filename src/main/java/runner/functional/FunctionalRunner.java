
package runner.functional;

import errors.KoanError;
import koans.functional.AnonymousClass;
import koans.functional.ConsumerLambda;
import koans.functional.FunctionLambda;
import koans.functional.SupplierLambda;
import runner.KoanTester;
import runner.OrderedKoanRunner;

public class FunctionalRunner implements OrderedKoanRunner {

	public void runTests(KoanTester koanTester) throws KoanError {

		koanTester.test(new AnonymousClass(), new AnonymousClassTests());
		koanTester.test(new SupplierLambda(), new SupplierTests());
		koanTester.test(new ConsumerLambda(), new ConsumerTests());
		koanTester.test(new FunctionLambda(), new FunctionTests());
	}
}
