package se.udemy.elmira.controlFlow.exercise;

public class Ex1 {
    /*
        1. Write a method in 4 lines of code (not including method name/signature & curly braces) that
    outputs the days of the week, one per line, using a regular ‘for-loop’ and an array.
    1. Do it again using the enhanced ‘for-loop’.
    2. Do it again but make every other output line fully capitalized.
    Sunday
    MONDAY
    Tuesday
    WEDNESDAY
    etc…
     */
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (int day=0; day < days.length; day++) {
            System.out.println(days[day]);
        }

        // Using enhanced for-loop
        for (String day : days) {
            System.out.println(day);
        }

        // Alternating capitalization
        for (int day=0; day < days.length; day++) {
            if (day % 2 == 0) { // Review Numbers section for reminder of how this works
                System.out.println(days[day]);
            } else {
                System.out.println(days[day].toUpperCase());
            }
        }

        // Alternating capitalization - shorter
        for (int day=0; day < days.length; day++) {
            String output = day % 2 == 0 ? days[day] : days[day].toUpperCase();
            System.out.println(output);
        }
    }
}
