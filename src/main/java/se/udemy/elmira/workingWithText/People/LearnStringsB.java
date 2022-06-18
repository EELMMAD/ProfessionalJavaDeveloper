package se.udemy.elmira.workingWithText.People;

public class LearnStringsB {
    public static void main(String[] args) {
        String myText = ""; // no space in between
        System.out.println(myText.isEmpty()); //if the length of the string is zero  ---> true
        //System.out.println(myText.isBlank()); //true

        String myText1 = " "; // one space in between
        System.out.println(myText1.isEmpty()); //if the length of the string is NOT zero  ---> false

        String myText2 = "a";
       // System.out.println(myText2.isBlank()); //false
    }
}
