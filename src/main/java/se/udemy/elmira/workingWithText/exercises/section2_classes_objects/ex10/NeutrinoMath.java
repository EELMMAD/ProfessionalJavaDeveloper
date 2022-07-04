package se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex10;

public class NeutrinoMath {
    /*
    10. How might you model a Math class to know about Euler’s number?
     */
    public static final double E = Math.E;

    public static void main(String[] args) {

        System.out.println(NeutrinoMath.E); // Constants of this sort are typically modeled as a public static final
    }
}
