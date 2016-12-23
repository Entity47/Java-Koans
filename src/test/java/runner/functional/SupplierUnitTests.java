package runner.functional;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Supplier;

public class SupplierUnitTests {

    @Test
    public void lambdaReturningTrueSucceeds() {
        // arrange
        SupplierTests tests = new SupplierTests();
        Supplier<Boolean> supplier = () -> true;

        // act
        boolean result = tests.test(supplier);

        // assert
        Assert.assertTrue(result);
    }

    @Test
    public void lambdaReturningFalseFails() {
        // arrange
        SupplierTests tests = new SupplierTests();
        Supplier<Boolean> supplier = () -> false;

        // act
        boolean result = tests.test(supplier);

        // assert
        Assert.assertFalse(result);
    }
}
