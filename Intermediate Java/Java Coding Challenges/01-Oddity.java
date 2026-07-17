// Creating custom methods 

class OddityFinder {
    public static void main(String[] args) {
        int[] intArray = {332, 67, 86, 90, 26, 34, 92, 13, 70, 50};
        
        for (int number : intArray) {
            if (isOdd(number)) System.out.print(number + "\n");
        }
    }

    public static boolean isOdd(int n) {
        return (n % 2) != 0;
    }
    }