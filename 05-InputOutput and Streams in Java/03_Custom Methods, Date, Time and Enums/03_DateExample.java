/*
- LocalDate.now() — gets the current date (default format: yyyy-MM-dd)
- DateTimeFormatter.ofPattern(pattern) — defines a custom date format
- date.format(formatter) — converts a LocalDate into a formatted String
- LocalDate.parse(text) — converts a String (yyyy-MM-dd) into a LocalDate
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class 03_DateExample {
    public static void main(String[] args) {
        // LocalDate.now(): gets the current date
        LocalDate date = LocalDate.now();
        System.out.println("Current date in default format: " + date);

        // DateTimeFormatter.ofPattern(): defines a custom date format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // date.format(): applies the formatter, returns a formatted String
        System.out.println(date.format(formatter));

        // LocalDate.parse(): converts a String into a LocalDate object
        LocalDate parseDate = LocalDate.parse("2025-02-10");

        System.out.println("Parse the text into date: " + parseDate);
    }
}