public class NullWithWrappers {
    static int x;
    static Integer y;
    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(y);

        if (y == null) {
            System.out.println("y is not initialized so take corrective steps here");
        }

    }
}