
package runner.streams;

import errors.KoanError;
import koans.streams.StreamBuilder;
import runner.KoanTester;
import runner.OrderedKoanRunner;

public class StreamsRunner implements OrderedKoanRunner {

	public void runTests(KoanTester koanTester) throws KoanError {

		koanTester.test(new StreamBuilder(), new StreamBuilderTests());
	}
}
