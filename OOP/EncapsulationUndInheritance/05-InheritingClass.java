class Main {
        static class Car {
        public String color;
        public String model;
        public int year;

        public Car(String color, String model, int year) {
            this.color = color;
            this.model = model;
            this.year = year;
        }
    }

    static class Toyota extends Car {
        public Toyota(String color, String model, int year){

            super(color, model, year);
        }
    }
    public static void main(String[] args) {
        Toyota myToyota = new Toyota("black", "yaris", 2014);
        System.out.println(myToyota.model);
    }
}