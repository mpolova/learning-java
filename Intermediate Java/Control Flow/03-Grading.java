class Grader {
    public static void main(String[] args) {
        int grade = 14;

        if (grade > 11) {
            System.out.println("You've outdone yourself");
        } else if (grade >= 10) {
            System.out.println("You get a passing grade");
        } else {
            System.out.println("You get a failing grade");
        }
    }
}