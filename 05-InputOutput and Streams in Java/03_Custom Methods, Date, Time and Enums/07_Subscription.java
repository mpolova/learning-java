/*
- custom method — a reusable method combining LocalDate and arithmetic logic
- LocalDate parameter — passing a date into a method for calculation
- .plusDays(n) — returns a new date, n days after the given one
*/

import java.time.LocalDate;

public class 07_Subscription {
    // custom method: wraps plusDays() with a meaningful name
    static LocalDate calculateExpiration(LocalDate date, int days){
        // plusDays(): returns a new date, days after the given one
        return date.plusDays(days);
    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.now();

        // calls calculateExpiration() with today's date and a 60-day subscription
        LocalDate expiration = calculateExpiration(start, 60);
        System.out.println("Expiration date: " + expiration);
    }
}