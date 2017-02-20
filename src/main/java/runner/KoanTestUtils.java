package runner;

import koans.KoanFunction;

import java.util.Map;

public class KoanTestUtils {

    public static <T,U> boolean validateTestCases(KoanFunction<T, U> koan, Map<T,U> testCases) {

        for(Map.Entry<T, U> entry : testCases.entrySet()) {
            T testCase = entry.getKey();
            U expected = entry.getValue();

            U result = koan.answer(testCase);
            if (result != expected) {
                return false;
            }
        }

        // all tests passed
        return true;
    }
}
