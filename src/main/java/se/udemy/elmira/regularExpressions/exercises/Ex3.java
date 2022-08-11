package se.udemy.elmira.regularExpressions.exercises;

public class Ex3 {
    /*
    . How can you use parentheses in a regex for grouping but without capturing?
     */

    public static void main(String[] args) {
        String regex2 = "A(?:[bg])racada[bg]ra"; // Can no longer use '\\1' backreference since no longer capturing group
        System.out.println("Abracadabra".matches(regex2));
        System.out.println("Agracadagra".matches(regex2));
    }
}
