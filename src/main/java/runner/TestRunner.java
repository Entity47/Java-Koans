package runner;

import errors.KoanError;
import runner.functional.FunctionalRunner;
import runner.futures.FuturesRunner;
import runner.streams.StreamsRunner;

import java.util.ArrayList;
import java.util.List;

public class TestRunner implements OrderedKoanRunner {

    @Override
    public void runTests(KoanTester koanTester) throws KoanError {

        List<OrderedKoanRunner> runners = new ArrayList<>();
        runners.add(new FunctionalRunner());
        runners.add(new StreamsRunner());
        runners.add(new FuturesRunner());

        for(OrderedKoanRunner runner : runners) {
            runner.runTests(koanTester);
        }
    }
}
