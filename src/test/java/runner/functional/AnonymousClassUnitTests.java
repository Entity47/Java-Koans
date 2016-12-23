package runner.functional;

import koans.functional.AnonymousClass;
import org.junit.Test;

public class AnonymousClassUnitTests {

    @Test
    public void testAnonymousClassReturningTrueIsSuccessful() {
        // arrange
        AnonymousClassTests anonTest = new AnonymousClassTests();
        AnonymousClass.Anon anon = new AnonymousClass.Anon() {
            public boolean isAnon() {
                return true;
            }
        };

        // act
        boolean result = anonTest.test(anon);

        // assert
        org.junit.Assert.assertTrue(result);
    }

    @Test
    public void testAnonymousClassReturningFalseFailsTest() {
        // arrange
        AnonymousClassTests anonTest = new AnonymousClassTests();
        AnonymousClass.Anon anon = new AnonymousClass.Anon() {
            public boolean isAnon() {
                return false;
            }
        };

        // act
        boolean result = anonTest.test(anon);

        // assert
        org.junit.Assert.assertFalse(result);
    }
}
