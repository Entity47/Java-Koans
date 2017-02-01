package runner.streams;

import runner.KoanFunctionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamAllMatchTests implements KoanFunctionTest<Stream<Integer>, Boolean> {
    @Override
    public Map<Stream<Integer>, Boolean> getTestCases() {
        Map<Stream<Integer>, Boolean> testCases = new HashMap<>();

        // all > 0 integers, should pass
        testCases.put(Stream.of(1, 2, 3), Boolean.TRUE);

        // all positive, but contains zero, should fail
        testCases.put(Stream.of(0, 1, 2, 3), Boolean.FALSE);

        // all < 0, should fail
        testCases.put(Stream.of(-1, -2, -3), Boolean.FALSE);

        // mix of > 0 and < 0, should fail
        testCases.put(Stream.of(-1, 1), Boolean.FALSE);

        return testCases;
    }
}
