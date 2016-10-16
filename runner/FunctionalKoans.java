
package runner;

import errors.KoanError;
import koans.functional.AnonymousKoan;

public class FunctionalKoans {

	public void run() throws KoanError {
		runAnonymousKoan();
	}

	private void runAnonymousKoan() throws KoanError {

		AnonymousKoan koan = new AnonymousKoan();
		String koanName = koan.getClass().getName();

		AnonymousKoan.Anon anon = koan.getAnonymousClass();

		if (anon == null) {
			throw new KoanError(koan, "Anonymous class must not be null.");
		}
		if (!anon.isAnon()) {
			throw new KoanError(koan, "Anonymous class claims it in not anonymous!");
		}

		/*
		 * Anonymous classes will end in $1, or something similar.
		 * If the returned class did not end with $ followed by a number then it was not anonymous.
		 */
		String anonClassName = anon.getClass().getName();
		if (!anonClassName.matches(koanName + "\\$[0-9]+$")) {
			throw new KoanError(koan, "Returned class was not anonymous.");
		}
	}
}
