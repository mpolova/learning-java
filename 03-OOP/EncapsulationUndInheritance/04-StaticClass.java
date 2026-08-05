class Main {
     static class Formula{
        static double calculateSpeed(double distance, double time) {
            return distance / time;
        }
     }

     public static void main(String [] args) {
        System.out.println(Formula.calculateSpeed(165.00, 15.00));
     }

}
