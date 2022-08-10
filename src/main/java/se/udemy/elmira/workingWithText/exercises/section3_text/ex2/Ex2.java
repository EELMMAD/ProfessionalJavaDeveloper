package se.udemy.elmira.workingWithText.exercises.section3_text.ex2;

public class Ex2 {
    public static void main(String[] args) {
        /*
        2. Write code that replaces the word “cat” with the word “dog” wherever it shows up in a
           sentence.
         */

        String sentence = "I love to play with cats because cats are really fun.";
        System.out.println(sentence.replaceAll("cat", "dog"));
    }
}
