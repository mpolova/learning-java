import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Stream pipeline: map() is an intermediate operation that transforms
 * each element (here, converts to uppercase) without changing the
 * element count. collect(Collectors.toSet()) is a terminal operation
 * that gathers the resulting stream back into a Set, which also
 * removes duplicates automatically.
 */
public class 07_CityProcessor {
    public static void main(String[] args) {
        List<String> cities = List.of("paris", "london", "new york", "paris");

        Set<String> uniqueUppercaseCities = cities.stream()
            // Convert each city name to uppercase
            .map(city -> city.toUpperCase())
            // Collect the result and store in a Set
            .collect(Collectors.toSet());

        System.out.println(uniqueUppercaseCities);
    }
}