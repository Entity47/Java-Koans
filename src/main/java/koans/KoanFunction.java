package koans;

/*
 * Argument Koans are basically functions (in the java.util.function sense) that map an argument to an output, but they
 * are defined separately to allow for a more descriptive (koan-like) method name.
 */
@FunctionalInterface
public interface KoanFunction<T,U> {

    U answer(T arg);
}
