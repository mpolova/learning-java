import java.util.ArrayList;
import java.util.ListIterator;

/*
 * ListIterator can traverse a list backwards using hasPrevious()/previous(),
 * and insert new elements at the current cursor position with add() -
 * capabilities a plain Iterator does not have.
 * Here it walks the list in reverse and inserts "correction" right
 * before the word "error", simulating an undo/fix operation.
 */
public class 04_TextEditorUndo {
    public static void main(String[] args) {
        ArrayList<String> textHistory = new ArrayList<>();
        textHistory.add("Hello");
        textHistory.add("error");
        textHistory.add("world");

        // Create ListIterator starting from the end of the list
        ListIterator<String> it = textHistory.listIterator(textHistory.size());

        // Check if more elements are available in reverse order
        while (it.hasPrevious()) {
            // Retrieve previous element
            String word = it.previous();
            if (word.equals("error")) {
                // Insert "correction" before "error"
                it.add("correction");
            }
        }

        System.out.println(textHistory);
    }
}