package runner.futures;

import koans.KoanFunction;
import runner.KoanFunctionTest;

import java.util.concurrent.CompletableFuture;

public class ChainingFuturesTests implements KoanFunctionTest<CompletableFuture<Integer>, CompletableFuture<Boolean>> {

    @Override
    public boolean test(KoanFunction<CompletableFuture<Integer>, CompletableFuture<Boolean>> koan) {

        boolean success1 = this.verifyKoan(koan, 9, true);
        boolean success2 = this.verifyKoan(koan, 10, false);
        boolean success3 = this.verifyKoan(koan, -1000, true);
        boolean success4 = this.verifyKoan(koan, 1000, false);

        return success1 && success2 && success3 && success4;
    }

    private boolean verifyKoan(KoanFunction<CompletableFuture<Integer>, CompletableFuture<Boolean>> koan,
                               int inputArg, boolean expected) {

        CompletableFuture<Integer> input = CompletableFuture.completedFuture(inputArg);
        CompletableFuture<Boolean> result = koan.answer(input);

        if (result.isDone()) {
            try {
                Boolean answer = result.get();
                return answer == expected;
            } catch(Exception e) {
                // just run to end of method
            }
        }

        // something prevented the future from being resolved
        return false;
    }

}
