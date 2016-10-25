
package runner.functional;

import errors.KoanError;
import koans.functional.LambdaFunction;
import runner.KoanRunner;

public class LambdaFunctionRunner implements KoanRunner {

	public void run() throws KoanError {

		LambdaFunction	koan = new LambdaFunction();

		LambdaFunction.LambdaWorker worker = koan.getLambdaFunction();

		FunctionalHelper.validateLambda(koan, worker);

		boolean finished = worker.workFinished();
		if (!finished) {
			throw new KoanError(koan, "Lambda worker should report that it is finished.");
		}
	}
}
