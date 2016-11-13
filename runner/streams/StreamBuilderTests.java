
package runner.streams;

import java.util.function.Predicate;
import java.util.stream.*;

public class StreamBuilderTests implements Predicate<Stream.Builder<String>> {

	public boolean test(Stream.Builder<String> builder) {

		Stream<String> stream = builder.build();

		long count = stream.distinct()
		                   .filter(s -> s == "Hello" || s == "World")
			               .count();

		return count == 2;
	}

}
