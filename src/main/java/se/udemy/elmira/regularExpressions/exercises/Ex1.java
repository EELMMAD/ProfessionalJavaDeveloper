package se.udemy.elmira.regularExpressions.exercises;

public class Ex1 {
    /*
     1. Write a regex that would match the following words: Dark, bark, Lark
    1. For extra challenge, could you additionally make it match: stark

     */

    public static void main(String[] args) {
        String regex = "[DbL]ark";
        String regex2 = "(St|[DbL])ark"; // Exercise 1.1 extra challenge
        System.out.println("Dark".matches(regex));
        System.out.println("bark".matches(regex));
        System.out.println("Lark".matches(regex));

        System.out.println("Stark".matches(regex2));
        System.out.println("Dark".matches(regex2));
        System.out.println("bark".matches(regex2));
        System.out.println("Lark".matches(regex2));
    }
}
