package se.udemy.elmira.workingWithText.stringConcatenation;

import java.util.Locale;

public class LearnStringsC { //Searching within a String indexOf()
    public static void main(String[] args) {
        String myText = "four score and seven years ago";
        System.out.println(myText.indexOf("seven"));

        //indexOf() stops when fined the first match
        //indexOF is caseSensitive

        System.out.println("1-----------------");
        String string1 = "ABCDEFGABCDEFG";
        System.out.println(string1.indexOf(65));  //A --> 65      each character has numerical code in java
        //It will give the index of First A

        System.out.println("2-----------------");
        String string2 = "BCDEFGABCDEFG";
        System.out.println(string2.indexOf(65));


        //-1 --> No Match --> not in there
        System.out.println("3-----------------");
        String string3 = "ABCDEFGABCDEFG";
        System.out.println(string3.indexOf(122));
        System.out.println(string3.indexOf("CAR"));
        System.out.println(string3.indexOf("ABC"));
        System.out.println(string3.indexOf("abc"));

        //lastIndexOf() --> last occurrence of
        System.out.println(string3.lastIndexOf("A"));

        System.out.println(string3.indexOf("A", 2));
        System.out.println(string3.indexOf("A", 0));

        System.out.println("4-----------------");
        //extract phone number
        //String phoneNumber = "(763) 872-6633".strip(); // remove the before and after spaces.
        String phoneNumber = "(763) 872-6633";
        String areaCode = parseAreaCode(phoneNumber);
        String exchange = parseExchange(phoneNumber);
        String lineNumber = parseLineNumber(phoneNumber);

        System.out.println(areaCode);
        System.out.println(exchange);
        System.out.println(lineNumber);
    }

    public static String parseAreaCode(String phoneNumber) {
        int openParens = phoneNumber.indexOf("(");
        int closeParens = phoneNumber.indexOf(")");
        String areCode = phoneNumber.substring(openParens + 1, closeParens);
        return areCode;
    }

    public static String parseExchange(String phoneNumber) {
        int spaceIdx = phoneNumber.indexOf(" ");
        int hyphenIdx = phoneNumber.indexOf("-");
        String exchange = phoneNumber.substring(spaceIdx + 1, hyphenIdx);
        return exchange;
    }

    public static String parseLineNumber(String phoneNumber) {
        int hyphenIdx = phoneNumber.indexOf("-");
        String lineNumber = phoneNumber.substring(hyphenIdx + 1);
        return lineNumber;
    }
}
