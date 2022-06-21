package se.udemy.elmira.workingWithText.People.stringConcatenation;

public class LearnStrings {
    public static void main(String[] args) {
        String text1 = "this is my text1";
        String text2 = "this is my text2";
        System.out.println(text1 + " " + text2 + " hello");
        System.out.println("------------");
        System.out.println(text1.concat(text2));
        System.out.println("my string literal".concat("second string literal"));
    }
}
