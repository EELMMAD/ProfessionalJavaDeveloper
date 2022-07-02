package se.udemy.elmira.workingWithText.exercises.section2_classes_objects;

public class Ex2 {
    public static void main(String[] args) {
        /*
        2. Create an array and initialize it with the days of the week.
        2.1.Use System.out.println() to print:
        2.1.1.The number of items in the array
        2.1.2.The 4th day in the array
         */
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek.length);  // Print number of item in array
        System.out.println(daysOfWeek[3]); // Print 4th day in the array. Note: arrays are zero-based, so 1st item is 0 & 4th item is 3.
    }
}
