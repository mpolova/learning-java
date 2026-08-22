// Demonstrates a simple unit test with JUnit.
// The test verifies that the lastDigit() method correctly
// returns the last digit of a positive integer.

public class 04_LastDigitWithTests {

    public static void main(String[] args) {
        // Runs the JUnit test class and prints the test results.
        launchTestsAndPrint(LastDigitTest.class);
    }
}

class LastDigitTest {

    // Marks this method as a JUnit test.
    @Test
    void testLastDigit() {

        // Arrange: define the input and expected result.
        int number = 2025;
        int expected = 5;

        // Act: call the method being tested.
        int actual = LastDigit.lastDigit(number);

        // Assert: verify that the actual result matches the expected result.
        assertEquals(expected, actual);
    }
}