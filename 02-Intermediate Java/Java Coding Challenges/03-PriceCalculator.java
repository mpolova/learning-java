// Updating all of the prices in your inventory at one time, adding half of its value to it

class PriceCalculator {
    static double oneAndAHalf(double a) {
        return a + a / 2;
    }

    public static void main(String[] args) {
        double[] numbers = {76, 38.3, 10, 42, 98.5, 84, 50, 72.2, 98, 96};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = oneAndAHalf(numbers[i]);
            System.out.println(numbers[i]);
        }
    }
}