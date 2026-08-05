class Msin {
    static class Car {
        String color;
        String model;
        int year;

        Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
        }

        void turnEngineOn() {
            System.out.println("engine is on");
        }
    }
    public static void main(String[] args) {
        Car myCar = new Car("red", "camry", 2022);
        myCar.turnEngineOn();
    }
}