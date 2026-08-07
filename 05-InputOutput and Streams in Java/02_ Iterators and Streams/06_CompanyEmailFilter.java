import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream API pipeline: filter() is an intermediate operation that keeps
 * only elements matching a condition (returns a new Stream, can be
 * chained further), while count() is a terminal operation that ends
 * the pipeline and returns the number of remaining elements as a long.
 */
public class 06_CompanyEmailFilter {
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("alice@company.com");
        emails.add("bob@gmail.com");
        emails.add("charlie@company.com");
        emails.add("david@yahoo.com");

        // Convert list to Stream
        Stream<String> stream = emails.stream();
        long count = stream
            // Filter email ends with "@company.com"
            .filter(email -> email.endsWith("@company.com"))
            // Count matching emails
            .count();

        System.out.println("Total company emails: " + count);
    }
}