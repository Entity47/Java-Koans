package runner.streams;

import koans.KoanFunction;
import runner.KoanFunctionTest;
import runner.KoanTestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class StreamAnyMatchTests implements KoanFunctionTest<Stream<Integer>, Boolean> {

    @Override
    public boolean test(KoanFunction<Stream<Integer>, Boolean> koan) {

        Map<Stream<Integer>, Boolean> testCases = new HashMap<>();

        // all > 0 integers, should pass
        testCases.put(Stream.of(1, 2, 3), Boolean.TRUE);

        // all < 0, should fail
        testCases.put(Stream.of(-1, -2, -3), Boolean.FALSE);

        // mix of > 0 and < 0, should pass
        testCases.put(Stream.of(-1, -2, -3, 1), Boolean.TRUE);

        return KoanTestUtils.validateTestCases(koan, testCases);
    }
}
