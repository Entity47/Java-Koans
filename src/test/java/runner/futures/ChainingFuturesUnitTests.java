package runner.futures;

import koans.KoanFunction;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class ChainingFuturesUnitTests {

    @Test
    public void testSuccessfulFutureThenApply() {
        ChainingFuturesTests tester = new ChainingFuturesTests();
        KoanFunction<CompletableFuture<Integer>, CompletableFuture<Boolean>> koan =
                (in) -> in.thenApply(i -> i < 10);

        boolean success = tester.test(koan);

        Assert.assertTrue(success);
    }

    @Test
    public void testIncorrectFutureThenApply() {
        ChainingFuturesTests tester = new ChainingFuturesTests();
        KoanFunction<CompletableFuture<Integer>, CompletableFuture<Boolean>> koan =
                (in) -> in.thenApply(i -> i > 10);

        boolean success = tester.test(koan);

        Assert.assertFalse(success);
    }

    @Test
    public void testIncompleteFuture() {
        ChainingFuturesTests tester = new ChainingFuturesTests();
        KoanFunction<CompletableFuture<Integer>, CompletableFuture<Boolean>> koan =
                (in) -> new CompletableFuture<>();

        boolean success = tester.test(koan);

        Assert.assertFalse(success);
    }

    @Test
    public void testExceptionFuture() {
        ChainingFuturesTests tester = new ChainingFuturesTests();
        CompletableFuture<Boolean> exceptionalResult = new CompletableFuture<>();
        exceptionalResult.completeExceptionally(new RuntimeException());
        KoanFunction<CompletableFuture<Integer>, CompletableFuture<Boolean>> koan =
                (in) -> exceptionalResult;

        boolean success = tester.test(koan);

        Assert.assertFalse(success);
    }
}
