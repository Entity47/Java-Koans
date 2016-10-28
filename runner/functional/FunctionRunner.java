
package runner.functional;

import java.util.function.Function;

import errors.KoanError;
import koans.functional.FunctionLambda;
import runner.KoanRunner;

public class FunctionRunner implements KoanRunner {

	public void run() throws KoanError {

		FunctionLambda koan = new FunctionLambda();

		Function<Integer,Boolean> isEven = koan.getIsEvenLambda();

		FunctionalHelper.validateLambda(koan, isEven);

		if (isEven.apply(5) == true) {
			throw new KoanError(koan, "Lambda function incorrectly says 5 is even");
		}
		if (isEven.apply(6) == false) {
			throw new KoanError(koan, "Lambda function incorrectly says 6 is not even");
		}
	}
}
