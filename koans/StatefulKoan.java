
package koans;

public abstract class StatefulKoan<T, U> extends Koan<T> {

	public abstract U getState();
}
