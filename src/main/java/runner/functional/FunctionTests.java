
package runner.functional;

import java.util.function.Function;
import java.util.function.Predicate;

import errors.KoanError;
import koans.functional.FunctionLambda;
import runner.KoanRunner;

public class FunctionTests implements Predicate<Function<Integer,Boolean>> {

	public boolean test(Function<Integer,Boolean> isEven) {

		return FunctionalTests.isValidLambda(isEven)
			&& !isEven.apply(5)
			&& isEven.apply(6);
	}
}
