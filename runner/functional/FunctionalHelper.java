
package runner.functional;

import errors.KoanError;

public class FunctionalHelper {

	public static void validateLambda(Object koan, Object lambda) throws KoanError {

		if (lambda == null) {
			throw new KoanError(koan, "Lambda must not be null");
		}

		String name = lambda.getClass().getName();
		if (!name.contains("$$Lambda")) {
			throw new KoanError(koan, "Object is not a lambda function.");
		}
	}

	public static void validateAnonymousClass(Object koan, Object anonymousClass)
		throws KoanError {

		if (anonymousClass == null) {
			throw new KoanError(koan, "Anonymous class must not be null.");
		}

		/*
		 * Anonymous classes will end in $1, or something similar.
		 * If the returned class did not end with $ followed by a number then it was not anonymous.
		 */
		String koanName = koan.getClass().getName();
		String anonClassName = anonymousClass.getClass().getName();
		if (!anonClassName.matches(koanName + "\\$[0-9]+$")) {
			throw new KoanError(koan, "Returned class was not anonymous.");
		}
	}
}
