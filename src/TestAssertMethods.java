//Junit is a unit testing framework for Java
//To ensure the functionality of an application testing is done
//Unit testing is at the developers' level, it is the testing of single class or method
//This helps a software company deliver quality products
//Junit is an open source framework used for writing and running tests
package JUnit;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

// This is sandbox code from Shaun who found the base code from tutorial.com
// This was fun to play around with and manipulate to see the test results
// I left the tests set to pass but the values can be changed to demonstrate failure
public class TestAssertMethods {

    @Test
    public void testAssertions() {
        //test data, variable declarations
        String Str1 = "AssertTesting";
        String Str2 = "Testing";
        String Str3 = null;
        String Str4 = "AssertTesting";


        int value1 = 38;
        int value2 = 50;

        String[] expectedArray = {"Tom", "Kelly", "Sheynah"};
        String[] resultArray = {"Tom", "Kelly", "Sheynah"};

        // assertEquals - Checks that two objects are equal
        assertEquals(Str1, Str4);

        // assertArrayEquals- Checks that the expected array and the resulted array are equal
        // the type of Array might be int,long,short,char,byte or java.lang.Object
        assertArrayEquals(expectedArray, resultArray);

        // assertFalse - Checks that a condition is false
        assertFalse(value1 > value2 );

        // assertTrue - checks that a condition is true
        assertTrue(value1 < value2);

        // assertNotNull - checks that an object is not null
        assertNotNull(Str1);

        // assertNotSame - checks that two object references do not refer to the same object
        assertNotSame(Str1, Str2);

        // assertNull - Checks that an object is null
        assertNull(Str3);

        // assertSame - Checks that two objects refer to the same object
        assertSame(Str4, Str4);

        // assertThat - Check if an array contains particular values
        assertThat(Arrays.asList("cat", "dog", "pig", "chicken"), hasItems("chicken", "pig"));

    }

}
