// This program demonstrates an edge case with an empty array.
// The findMax() method assumes that the array contains at least one element.
// If the array is empty, numbers[0] does not exist.
// This causes an ArrayIndexOutOfBoundsException.

public class 03_MaxValue {

    public static void main(String[] arguments) {
        System.out.println(findMax(new int[]{}));
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}