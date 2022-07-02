package se.udemy.elmira.workingWithText.exercises.section2_classes_objects;

public class Ex6 {
    public static void main(String[] args) {
        /*
        6. How can you create a method that can be called without creating an instance of its class?
         */

        // No need to call "new Exercise6().mySpecialMethod()"
        Ex6.mySpecialMethod();
    }

    public static void mySpecialMethod(){
        System.out.println("My special method needs no class instance to run.");
    }
}
