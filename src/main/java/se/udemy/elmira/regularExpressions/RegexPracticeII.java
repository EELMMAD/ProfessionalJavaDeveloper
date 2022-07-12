package se.udemy.elmira.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeII {
    public static void main(String[] args) {
        String regex = "(1[-.,\\s]?)?(\\d{3}[-.,\\s]?)(\\d{3}[-.,\\s]?)\\d{4}";
        String phoneNumber = "1.232.333.2365";
        System.out.println(phoneNumber.matches(regex));

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(phoneNumber);


        if (mat.matches()) {
            System.out.println(mat.group(1));
            System.out.println(mat.group(2));
            System.out.println(mat.group(3));
        }
    }
}
