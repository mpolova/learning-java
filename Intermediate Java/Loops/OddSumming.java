// Using a while loop

class Adder{
    public static void main(String[] args) {
        int total = 0;
        int i = 1;

        while (total < 100) {
            total += i;

            i += 2;
        }
        System.out.println("We reach " +  total + " when summing up to " + i);
    }

}