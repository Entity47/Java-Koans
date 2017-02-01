
package runner;

import errors.KoanError;

@FunctionalInterface
public interface OrderedKoanRunner {

	public void runTests(KoanTester koanTester) throws KoanError;
}
