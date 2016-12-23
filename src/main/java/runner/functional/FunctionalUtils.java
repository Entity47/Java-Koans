
package runner.functional;

public class FunctionalUtils {

	public static <T> boolean isLambda(T obj) {

		return obj.getClass().getName().contains("$$Lambda");
	}
}
