
package koans;

import java.util.function.Supplier;

/*
 * This class hides the fact that Koans are simply suppliers.
 */
public abstract class Koan<T> implements Supplier<T> {

	public T get() {
		return answer();
	}

	public abstract T answer();

}
