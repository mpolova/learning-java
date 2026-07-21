class Main {
    static class Tesla {
        public void drive() {
            System.out.println("drive normally");
        }

        public void drive(boolean isDrivingbackward){
            System.out.println("driving backward");
        }
    }

    public static void main(String[] args) {
        Tesla myTesla = new Tesla();
        myTesla.drive();
        myTesla.drive(true);
    }
}