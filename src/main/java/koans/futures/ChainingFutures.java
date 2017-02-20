package koans.futures;

import errors.EmptyKoan;
import koans.KoanFunction;

import java.util.concurrent.CompletableFuture;

public class ChainingFutures implements KoanFunction<CompletableFuture<Integer>, CompletableFuture<Boolean>> {

    @Override
    public CompletableFuture<Boolean> answer(CompletableFuture<Integer> arg) {

        /*
         * Return a new CompletableFuture that uses with the argument and returns a new future that evaluates to true
         * if the integer is less then 10, or false otherwise.
         */

        throw new EmptyKoan();
    }
}
