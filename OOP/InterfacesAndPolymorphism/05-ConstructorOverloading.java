class main {
    static class Tesla {
        public String model;
        public String color;
        public boolean isInsured;

        public Tesla(String model, String color){
            this.model = model;
            this.color = color;
        }

        public Tesla(String model,  String color, boolean isInsured){
            this.model = model;
            this.color = color;
            this.isInsured = isInsured;
        }
    }

    public static void main(String[] args) {
        Tesla myFirstTesla = new Tesla("modelX", "red");

        Tesla mySecondTesla = new Tesla("modelY", "clack", false);
    }
}