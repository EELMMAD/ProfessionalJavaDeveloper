package se.udemy.elmira.workingWithText.stringConcatenation;

public class LearnStringsE {
    public static void main(String[] args) {
        String firstText = "Apple";
        String secondText = "Apple";

        System.out.println(firstText.contentEquals(secondText)); //Compare both Character and String   //true
        System.out.println(firstText.equals(secondText)); //Compare Strings                            //true

        System.out.println("------------------");

        String str1 = "Apple";
        StringBuffer str2 = new StringBuffer("Apple");

        System.out.println(str1.contentEquals(str2));  //true
        System.out.println((str1.equals(str2)));  //false

        System.out.println("------------------");

        String str3 = "Apple";
        StringBuilder str4 = new StringBuilder("Apple");

        System.out.println(str3.contentEquals(str2));  //true
        System.out.println((str4.equals(str2)));  //false
    }
}
