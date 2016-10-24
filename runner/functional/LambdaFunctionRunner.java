
package runner.functional;

import errors.KoanError;
import koans.functional.LambdaFunction;
import runner.KoanRunner;

public class LambdaFunctionRunner implements KoanRunner {

	public void run() throws KoanError {

		LambdaFunction	koan = new LambdaFunction();

		LambdaFunction.LambdaWorker worker = koan.getLambdaFunction();

		if (worker == null) {
			throw new KoanError(koan, "Lambda function must not be null.");
		}

		boolean finished = worker.workFinished();
		if (!finished) {
			throw new KoanError(koan, "Lambda worker should report that it is finished.");
		}

		String name = worker.getClass().getName();
		if (!name.contains("$$Lambda")) {
			throw new KoanError(koan, "Lambda worker must be a Lambda function.");
		}
	}
}
