// for-each loop through a HashSet

import java.util.HashSet;

public class 01_CityDisplay {   // class name has NO "01_" prefix
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // for-each loop through a HashSet
        for (String city : cities) {
            System.out.println(city);
        }
    }
}