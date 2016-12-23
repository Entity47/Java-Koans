
package koans.streams;

import errors.EmptyKoan;
import koans.Koan;

import java.util.stream.Stream;

public class StreamBuilder implements Koan<Stream.Builder<String>> {

	public Stream.Builder<String> answer() {
		/*
		 * Return a stream builder containing two strings: "Hello" and "World" (case sensitive)
		 */
		throw new EmptyKoan();
	}
}
