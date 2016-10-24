
package koans.functional;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

import errors.EmptyKoan;

public class ConsumerLambda {

	public List<String> consumedStrings = new ArrayList<String>();

	public Consumer<String> getConsumerLambda() {
		/*
		 * Return a Consumer lambda function that consumes strings and adds them
		 * to the list of consumed strings.
		 */
		 throw new EmptyKoan();
	}

}
