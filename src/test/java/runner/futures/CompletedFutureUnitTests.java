package runner.futures;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.CompletableFuture;

public class CompletedFutureUnitTests {

    @Test
    public void CompletedFutureReturnTrueSucceeds() {
        CompletedFutureTests futureTests = new CompletedFutureTests();
        CompletableFuture<Boolean> future = CompletableFuture.completedFuture(true);

        boolean isCompletedTrue = futureTests.test(future);

        Assert.assertTrue(isCompletedTrue);
    }

    @Test
    public void CompletedFutureReturningFalseFails() {
        CompletedFutureTests futureTests = new CompletedFutureTests();
        CompletableFuture<Boolean> future = CompletableFuture.completedFuture(false);

        boolean isCompletedTrue = futureTests.test(future);

        Assert.assertFalse(isCompletedTrue);
    }

    @Test
    public void IncompleteFutureFails() {
        CompletedFutureTests futureTests = new CompletedFutureTests();
        CompletableFuture<Boolean> future = new CompletableFuture<>();

        boolean isCompletedTrue = futureTests.test(future);

        Assert.assertFalse(isCompletedTrue);
    }

    @Test
    public void ExceptionalFutureFails() {
        CompletedFutureTests futureTests = new CompletedFutureTests();
        CompletableFuture<Boolean> future = new CompletableFuture<>();
        future.completeExceptionally(new Exception("This is an exceptional future"));

        boolean isCompletedTrue = futureTests.test(future);

        Assert.assertFalse(isCompletedTrue);
    }
}
