package se.udemy.elmira.controlFlow.exercise;

public class Ex2 {
    /*
    . Repeat all parts of exercise #1,
    but use ‘while-loop’ instead of ‘for-loop’ (where applicable).
     */
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int day = 0;
        while (day < days.length) {
            System.out.println(days[day++]);
        }

        // Alternating capitalization
        day = 0;
        while (day < days.length) {
            if (day % 2 == 0) {
                System.out.println(days[day++]);
            } else {
                System.out.println(days[day++].toUpperCase());
            }
        }
        System.out.println("---");

        // Alternating capitalization - shorter
        day = 0;
        while (day < days.length) {
            String output = day % 2 == 0 ? days[day++] : days[day++].toUpperCase();
            System.out.println(output);
        }
    }
}
