
package runner.functional;

import java.util.function.Consumer;
import java.util.function.BiPredicate;
import java.util.List;

import errors.KoanError;
import koans.functional.ConsumerLambda;
import runner.KoanRunner;

public class ConsumerTests implements BiPredicate<Consumer<String>, List<String>> {

	public boolean test(Consumer<String> consumer, List<String> state) {

		return FunctionalTests.isValidLambda(consumer) && this.consumesStrings(consumer, state);
	}

	public boolean consumesStrings(Consumer<String> consumer, List<String> consumedStrings) {

		consumer.accept("test1");
		consumer.accept("test2");
		consumer.accept("test3");

		boolean threeStringsAdded = consumedStrings.size() == 3;
		boolean containsFirst = consumedStrings.get(0) == "test1";
		boolean containsSecond = consumedStrings.get(1) == "test2";
		boolean containsThird = consumedStrings.get(2) == "test3";

		return threeStringsAdded && containsFirst && containsSecond && containsThird;
	}
}
