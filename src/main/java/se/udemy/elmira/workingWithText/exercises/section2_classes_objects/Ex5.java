package se.udemy.elmira.workingWithText.exercises.section2_classes_objects;

public class Ex5 {
    public static void main(String[] args) {
        /*
        5. Write a method that allows you to pass any number of Strings as parameter inputs without
           using an array.
         */
        Ex5 exercise5 = new Ex5();
        exercise5.myMultiInputMethod("one", "two", "three", "four");
        exercise5.myMultiInputMethod("apple", "orange", "pineapple");
        exercise5.myMultiInputMethod("Bobby");
    }

    /* A method that allows any number of Strings to be passed as parameter inputs without an array */
    private void myMultiInputMethod(String...arg){}
}
