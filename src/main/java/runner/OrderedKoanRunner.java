
package runner;

import errors.KoanError;

public interface OrderedKoanRunner {

	// TODO: Try defining only an ordered list of tests, run them elsewhere

	public void runTests(KoanTester koanTester) throws KoanError;
}
