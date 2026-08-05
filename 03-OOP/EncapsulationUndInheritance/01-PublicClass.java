class Main {
    static class Car {
        public String color;
        public String model;
        public int year;

        Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
        }

        public void turnEngineOn() {
            System.out.println("engine is on");
        }
        public int calculateMPG(int milesDriven, int gallonsUsed) {
            return milesDriven / gallonsUsed;
        }

    }
    public static void main(String[] args) {
        Car myCar = new Car("red", "camry", 2022);
        System.out.println(myCar.calculateMPG(180, 20));

    }
    
}