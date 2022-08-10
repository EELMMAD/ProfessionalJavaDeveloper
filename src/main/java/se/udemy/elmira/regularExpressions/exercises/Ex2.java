package se.udemy.elmira.regularExpressions.exercises;

public class Ex2 {
    /*
    2. Use capture groups to write a regex that could match: Abracadabra or Agracadagra
     */

    public static void main(String[] args) {
        String regex = "A[bg]racada[bg]ra";
        System.out.println("Abracadabra".matches(regex));
        System.out.println("Agracadagra".matches(regex));

        // Alternatively
        String regex2 = "A([bg])racada\\1ra"; // This would prevent matching Abracadagra - for example
        System.out.println("Abracadabra".matches(regex2));
        System.out.println("Agracadagra".matches(regex2));
    }
}
