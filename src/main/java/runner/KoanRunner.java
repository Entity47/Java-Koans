
package runner;

import errors.KoanError;

public interface KoanRunner {

	public void runTests(KoanTester koanTester) throws KoanError;
}
