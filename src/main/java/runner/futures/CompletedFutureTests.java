package runner.futures;

import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class CompletedFutureTests implements Predicate<CompletableFuture<Boolean>> {

    @Override
    public boolean test(CompletableFuture<Boolean> future) {

        return future.exceptionally(ex -> false)
                     .getNow(false);
    }
}
