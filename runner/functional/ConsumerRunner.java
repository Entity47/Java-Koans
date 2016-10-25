
package runner.functional;

import java.util.function.Consumer;

import errors.KoanError;
import koans.functional.ConsumerLambda;
import runner.KoanRunner;

public class ConsumerRunner implements KoanRunner {

	public void run() throws KoanError {

		ConsumerLambda koan = new ConsumerLambda();

		Consumer<String> consumer = koan.getConsumerLambda();

		FunctionalHelper.validateLambda(koan, consumer);

		consumer.accept("test1");
		consumer.accept("test2");
		consumer.accept("test3");

		boolean threeStringsAdded = koan.consumedStrings.size() == 3;
		boolean containsFirst = koan.consumedStrings.get(0) == "test1";
		boolean containsSecond = koan.consumedStrings.get(1) == "test2";
		boolean containsThird = koan.consumedStrings.get(2) == "test3";
		if (!threeStringsAdded || !containsFirst || !containsSecond || !containsThird) {
			throw new KoanError(koan, "Consumer must add consumed strings to list.");
		}
	}
}
