package runner;

import koans.KoanFunction;

public interface KoanFunctionTest<T,U> {

    boolean test(KoanFunction<T,U> koan);
}
