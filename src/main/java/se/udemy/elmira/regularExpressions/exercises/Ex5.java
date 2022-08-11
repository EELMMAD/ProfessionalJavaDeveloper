package se.udemy.elmira.regularExpressions.exercises;

public class Ex5 {
    /*
        Given the String “12345 Big St., Alphabet City, CA 90210” or any other address with the
    same format, can you write code that can parse and print out:
    1. The building number: 12345
    2. The Street: “Big St.”
    3. City: “Alphabet City”
    4. State: “CA”
    5. Postal Code: 90210
     */
    public static void main(String[] args) {
        String email = "jerry.seinfeld@jokes.nbc.com";
        String regex = "\\w+\\.?\\w*@(\\w+\\.)+\\w+"; // allows for jokes.com or jokes.blah.com or jokes.blah.blah.com, etc.
        System.out.println(email.matches(regex));
    }
}
