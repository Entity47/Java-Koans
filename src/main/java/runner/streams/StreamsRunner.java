
package runner.streams;

import errors.KoanError;
import koans.streams.StreamAllMatch;
import koans.streams.StreamAnyMatch;
import koans.streams.StreamBuilder;
import runner.KoanTester;
import runner.OrderedKoanRunner;

public class StreamsRunner implements OrderedKoanRunner {

	public void runTests(KoanTester koanTester) throws KoanError {

		koanTester.test(new StreamBuilder(), new StreamBuilderTests());
		koanTester.test(new StreamAllMatch(), new StreamAllMatchTests());
		koanTester.test(new StreamAnyMatch(), new StreamAnyMatchTests());
	}
}
