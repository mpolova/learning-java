class Main {
    static abstract class Car {
        void steer() {
            System.out.println("steer");
        }
    }
    static class Tesla extends Car {
        @Override
        public void steer() {
            System.out.println("tesla steer");
        }
    }

    public static void main(String[] args) {
        Tesla myTesla = new Tesla();

        myTesla.steer();
    }


}