
package koans.functional;

import errors.EmptyKoan;
import koans.Koan;

public class AnonymousClass implements Koan<AnonymousClass.Anon> {

	@FunctionalInterface
	public interface Anon {
		boolean isAnon();
	}

	public Anon answer() {

		/*
		 * Return an anonymous class that implements the Anon interface.
		 * This class must return true when isAnon() is called.
		 */
		 throw new EmptyKoan();
	}

}
