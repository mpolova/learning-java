package 06-Introduction to Testing in Java.03_Further Techniques and A nnotations;

public class IntReverser {

    public static int reverse(int num) {
        int inverted = 0;
        while (num != 0) {
            // At every iteration take the last digit with % 10 and add to inverted * 10.
            inverted = inverted * 10 + num % 10;
            // Discard the last digit using / 10.
            num = num / 10;
        }
        return inverted;
    }

    public static class IntReverserTest {
    
    	@Test
        public void testReverse_reversesNumber() {
            int input = 1234;
            int expected = 4321;

            int actual = IntReverser.reverse(input);

            assertEquals(expected, actual);
        }
    }

    public static void main(String[] args) {
		launchTestsAndPrint(IntReverserTest.class);
    }
}