

package runner.functional;

import errors.KoanError;
import koans.functional.AnonymousClass;
import runner.KoanRunner;

public class AnonymousClassRunner implements KoanRunner {

	public void run() throws KoanError {

		AnonymousClass koan = new AnonymousClass();

		AnonymousClass.Anon anon = koan.getAnonymousClass();

		FunctionalHelper.validateAnonymousClass(koan, anon);

		if (!anon.isAnon()) {
			throw new KoanError(koan, "Anonymous class claims it in not anonymous!");
		}
	}
}
