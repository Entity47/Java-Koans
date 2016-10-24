
package koans.functional;

import errors.EmptyKoan;

public class LambdaFunction {

	public interface LambdaWorker {

		public boolean workFinished();
	}

	public LambdaWorker getLambdaFunction() {

		/*
		 * Return a lambda function that implements the LambdaWorker interface.
		 * This lambda function should simply return true.
		 */
		throw new EmptyKoan();
	}

}
