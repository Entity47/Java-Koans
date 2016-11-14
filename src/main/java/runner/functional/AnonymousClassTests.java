

package runner.functional;

import java.util.function.Predicate;

import koans.functional.AnonymousClass;

public class AnonymousClassTests implements Predicate<AnonymousClass.Anon> {

	public boolean test(AnonymousClass.Anon anon) {

		return this.isAnonymousClass(anon) && this.isAnonImplemented(anon);
	}

	private Boolean isAnonImplemented(AnonymousClass.Anon anon) {
		return anon.isAnon();
	}

	private Boolean isAnonymousClass(Object anon) {

		/*
		 * Anonymous classes will end in $1, or something similar.
		 * If the returned class did not end with $ followed by a number then it was not anonymous.
		 */
		String anonClassName = anon.getClass().getName();
		return anonClassName.matches(".*\\$[0-9]+$");
	}
}
