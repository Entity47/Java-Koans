
package koans.functional;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

import errors.EmptyKoan;
import koans.StatefulKoan;

public class ConsumerLambda implements StatefulKoan<Consumer<String>, List<String>> {

	private List<String> consumedStrings = new ArrayList<String>();

	public List<String> getState() {
		return this.consumedStrings;
	}

	public Consumer<String> answer() {
		/*
		 * Return a Consumer lambda function that consumes strings and adds them
		 * to the list of consumed strings.
		 */
		 throw new EmptyKoan();
	}

}
