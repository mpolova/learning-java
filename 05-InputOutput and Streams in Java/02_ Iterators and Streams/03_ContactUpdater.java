import java.util.ArrayList;
import java.util.ListIterator;

/*
 * ListIterator: an extended Iterator, available only for List (not Set).
 * In addition to hasNext()/next()/remove() from Iterator, it adds:
 *   - set(newValue) - replaces the last element returned by next()
 *   - hasPrevious()/previous() - allows moving backwards through the list
 * Used here to find "Jon" in the list and update it to "John" in place.
 */
public class 03_ContactUpdater {
    public static void main(String[] args) {
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add("Alice");
        contacts.add("Jon");
        contacts.add("Charlie");

        // Create ListIterator for the contacts list
        ListIterator<String> it = contacts.listIterator();

        // Check if more elements are available
        while (it.hasNext()) {
            // Retrieve next element
            String name = it.next();
            if (name.equals("Jon")) {
                // Update element to "John"
                it.set("John");
            }
        }

        System.out.println(contacts);
    }
}