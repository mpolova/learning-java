/*
- recursion — a method calls itself to solve smaller subproblems
- base case — the condition that stops the recursion (here: n == 1)
- recursive step — the call that moves toward the base case (here: n-1)
*/

public class 02_Recursion {
    static int sum(int n) {
        // base case: stops recursion when n reaches 1
        if (n == 1) return 1;
        // recursive step: adds n, then calls sum() with n-1
        return n + sum(n-1);
    }
    public static void main(String[] args) {
        // starts the first recursive call
        System.out.println(sum(5));
    }
}