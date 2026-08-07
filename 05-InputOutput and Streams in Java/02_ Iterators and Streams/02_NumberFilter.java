// Iterator: hasNext(), next(), remove()

import java.util.HashSet;
import java.util.Iterator;

public class 02_NumberFilter {   // class name has NO "02_" prefix
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Iterator: hasNext(), next(), remove() - removes values above a threshold
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            int current = it.next();
            if (current > 25) {
                it.remove();
            }
        }

        System.out.println(numbers);
    }
}