
package koans;

/*
 * Stateful Koans allow testing of functionality that modifies the state of a Koan.
 */
public interface StatefulKoan<T, U> extends Koan<T> {

	public U getState();
}
