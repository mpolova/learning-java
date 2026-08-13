/*
- LocalDate.now() — gets the current date
- .plusDays(n) — returns a new LocalDate, n days after the original
- .minusDays(n) — returns a new LocalDate, n days before the original
*/

import java.time.LocalDate;

public class 04_DateArithmetic {
    public static void main(String[] args) {
        // LocalDate.now(): gets the current date
        LocalDate today = LocalDate.now();

        // plusDays(): adds 10 days to today
        LocalDate futureDate = today.plusDays(10);

        // minusDays(): subtracts 5 days from today
        LocalDate pastDate = today.minusDays(5);

        System.out.println(futureDate);
        System.out.println(pastDate);
    }
}