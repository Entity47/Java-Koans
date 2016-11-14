
package koans;

import java.util.function.Supplier;

/*
 * Koans are basically suppliers, but I want to use a more descriptive method name to show that Koans must be answered.
 */
 @FunctionalInterface
public interface Koan<T> {

	public T answer();

}
