package runner.futures;

import errors.KoanError;
import koans.futures.CompletedFuture;
import runner.OrderedKoanRunner;
import runner.KoanTester;

public class FuturesRunner implements OrderedKoanRunner {

    @Override
    public void runTests(KoanTester koanTester) throws KoanError {

        koanTester.test(new CompletedFuture(), new CompletedFutureTests());
    }
}
