Experiment with several wrapper methods and fields.
public class ExamineWrappers {
    public static void main(String[] args) {
        Double pi = 3.14;
        Double eulers = 2.71828;
        int x = pi.compareTo(eulers);
        System.out.println(x);

        System.out.println(Short.MAX_VALUE);

        boolean y = Boolean.parseBoolean("true");
        System.out.println(y);
    }
}