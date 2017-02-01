import errors.EmptyKoan;
import errors.KoanError;
import runner.KoanTester;
import runner.TestRunner;

public class KoanMain {

	public static void main(String[] args) {

		TestRunner runner = new TestRunner();
		KoanTester koanTester = new KoanTester();

		try {
			runner.runTests(koanTester);
		} catch (EmptyKoan empty) {
			StackTraceElement[] traceElems = empty.getStackTrace();
			String koanName = traceElems[0].getClassName();
			System.out.println("\n" + "Please contemplate: " + koanName + "\n");
			System.exit(0);
		} catch (KoanError error) {
			System.out.println("\n" + error.getKoan());
			System.out.println("------------------------------");
			System.out.println(error.getMessage() + "\n");
			System.exit(1);
		} catch(Exception e) {
			System.out.println("\n" + "Please solve this riddle:");
			e.printStackTrace();
			System.exit(1);
		}

		System.out.println("\nYou have completed all Koans!\n");
	}

}
