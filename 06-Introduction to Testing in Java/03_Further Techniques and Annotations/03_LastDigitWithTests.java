package 06-Introduction to Testing in Java.03_Further Techniques and A nnotations;
public class LastDigitWithTests {
  public static void main(String[] args) {
    launchTestsAndPrint(LastDigitTest.class);
  }
}

class LastDigitTest {

    @ParameterizedTest
    // Add the annotation to use a method to provide arguments and point it to the arguments method
    @MethodSource("getArgs")
    void testLastDigit(int number, int expected) {
        int actual = LastDigit.lastDigit(number);

        assertEquals(expected, actual);
    }

    private static List<Arguments> getArgs() {
        return List.of(
        	// Create three argument objects for the test using the same syntax
            Arguments.of(2025, 5),
            Arguments.of(-2025, 5),
            Arguments.of(2020, 0)
        );
    }
}