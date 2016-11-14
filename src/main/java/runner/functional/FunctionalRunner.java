
package runner.functional;

import errors.KoanError;
import koans.functional.*;
import runner.KoanRunner;
import runner.KoanTester;

public class FunctionalRunner implements KoanRunner {

	public void runTests(KoanTester koanTester) throws KoanError {

		koanTester.test(new AnonymousClass(), new AnonymousClassTests());
		koanTester.test(new SupplierLambda(), new SupplierTests());
		koanTester.test(new ConsumerLambda(), new ConsumerTests());
		koanTester.test(new FunctionLambda(), new FunctionTests());
	}
}
