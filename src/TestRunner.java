package JUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


// Sandbox code from Shaun he found the base code on Tutorialspoint.com
// Program will run the Junit tests in TestAssertMethods.java and print to the console
// If the test passed print with a true or if it failed print with a false.
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestAssertMethods.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            System.out.println("A test has failed.");
        }

        System.out.println("All tests have passed");
        System.out.println(result.wasSuccessful());
    }
}
