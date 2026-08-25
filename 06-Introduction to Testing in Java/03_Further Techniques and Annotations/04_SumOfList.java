package 06-Introduction to Testing in Java.03_Further Techniques and A nnotations;

public class SumOfList {
    public static void main(String[] args) {
		launchTestsAndPrint(ListSumTest.class);
    }
}

class ListSumTest {
    @ParameterizedTest
    // Invoke the correct annotation for a method source
    @MethodSource("listsAndSums")
    void sumList_sumsList(List<Integer> list, int expectedSum) {
        int actualSum = ListSum.sumList(list);

        assertEquals(expectedSum, actualSum);
    }

	// Declare the correct method signature
    static List<Arguments> listsAndSums() {
        return List.of(
                Arguments.of(List.of(1, 2, 3, 4), 10),
                Arguments.of(List.of(-5, 5), 0),
                Arguments.of(List.of(), 0),
                // Create a null list and the expected sum in that case
                Arguments.of(null, 0)); 
    }
}