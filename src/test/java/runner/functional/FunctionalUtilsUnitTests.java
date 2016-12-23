package runner.functional;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Supplier;

public class FunctionalUtilsUnitTests {

    @Test
    public void isLambda_trueIfLambda() {
        Supplier<Boolean> lambda = () -> true;

        boolean isLambda = FunctionalUtils.isLambda(lambda);

        Assert.assertTrue(isLambda);
    }

    @Test
    public void isLambda_falseIfAnonymousClass() {
        Supplier<Boolean> anonClass = new Supplier<Boolean>() {
            @Override
            public Boolean get() {
                return true;
            }
        };

        boolean isLambda = FunctionalUtils.isLambda(anonClass);

        Assert.assertFalse(isLambda);
    }

    @Test
    public void isLambda_falseIfObject() {
        Object obj = new Object();

        boolean isLambda = FunctionalUtils.isLambda(obj);

        Assert.assertFalse(isLambda);
    }
}
