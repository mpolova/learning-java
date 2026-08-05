class DiceGame {
    public static void main (String [] args) {
        int result = 5;

        if (result == 20) {
            System.out.println("That's a critical hit!");
        }

        if (result <= 10) {
            System.out.println("Unfortunately, you miss");
        }
    }
}