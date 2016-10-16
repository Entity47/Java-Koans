
package runner.functional;

import errors.KoanError;
import runner.KoanRunner;

public class FunctionalRunner implements KoanRunner {

	public void run() throws KoanError {

		AnonymousClassRunner anon = new AnonymousClassRunner();
		anon.run();
	}
}
