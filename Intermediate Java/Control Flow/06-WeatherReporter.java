class WeatherReporter {
    public static void main(String[] args) {
        String weather = "Sunny";

        switch (weather) {
            case "Windy":
                System.out.println("Take an umbrella");
                break;

                case "Sunny":
                    System.out.println("Don't forget your sunscreen");
                    break;

                case "Cloudy":
                    System.out.println("The umbrella might be great");
                    break;
                
                default:
                    System.out.println("I don't know what the weather will be like");

        }
    }

}
