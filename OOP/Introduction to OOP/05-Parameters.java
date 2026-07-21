class Main {
    static class Car {
        String color;
        String model;
        int year;

        Car(String color, String model, int year){
            this.color = color;
            this.model = model;
            this.year = year;
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("blue", "corolla", 2022);
        System.out.println(myCar.year);
    }
}