
package runner.streams;

import errors.KoanError;
import koans.streams.StreamBuilder;
import runner.KoanTester;
import runner.KoanRunner;

public class StreamsRunner implements KoanRunner {

	public void runTests(KoanTester koanTester) throws KoanError {

		koanTester.test(new StreamBuilder(), new StreamBuilderTests());
	}
}
