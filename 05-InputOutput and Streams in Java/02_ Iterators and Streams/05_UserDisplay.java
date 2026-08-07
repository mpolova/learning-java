import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Stream API: java.util.stream lets you process a collection as a
 * pipeline instead of writing a manual loop. Here, list.stream()
 * converts the List into a Stream, and forEach() runs the given
 * lambda expression for every element in it.
 */
public class 05_UserDisplay {
    public static void main(String[] args) {
        List<String> usernames = new ArrayList<>();
        usernames.add("Alice123");
        usernames.add("BobTheCoder");
        usernames.add("CharlieDev");
        usernames.add("David99");

        // Convert list to Stream
        Stream<String> stream = usernames.stream();

        // Print each username
        stream.forEach(name -> System.out.println("User: " + name));
    }
}