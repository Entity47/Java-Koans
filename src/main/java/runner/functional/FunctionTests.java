
package runner.functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTests implements Predicate<Function<Integer,Boolean>> {

	public boolean test(Function<Integer,Boolean> isEven) {

		return FunctionalUtils.isLambda(isEven)
			&& !isEven.apply(5)
			&& isEven.apply(6);
	}
}
