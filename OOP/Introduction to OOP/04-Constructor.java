class Main {
    static class Car {
        String color;
        String model;
        int year;

        Car() {
            this.model = "camry";
            this.color = "red";
            this.year = 2019;
        }
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        System.out.println(myCar.color);
    }
}
