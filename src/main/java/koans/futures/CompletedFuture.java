package koans.futures;

import errors.EmptyKoan;
import koans.Koan;

import java.util.concurrent.CompletableFuture;

public class CompletedFuture implements Koan<CompletableFuture<Boolean>> {

    @Override
    public CompletableFuture<Boolean> answer() {
        /*
         * Return a completed future. This future should be completed with the boolean value true.
         */
        throw new EmptyKoan();
    }
}
