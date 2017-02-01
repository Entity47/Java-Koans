package runner;

import java.util.Map;

public interface KoanFunctionTest<T,U> {

    Map<T,U> getTestCases();
}
