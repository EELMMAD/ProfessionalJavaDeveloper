package se.udemy.elmira.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeII {
    public static void main(String[] args) {
        String regex = "((\\d{1,2})[-.,\\s]?)?((\\d{3})[-.,\\s]?)((\\d{3})[-.,\\s]?)(\\d{4})";
        String phoneNumber = "12.232.333.2365";
        System.out.println(phoneNumber.matches(regex));

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(phoneNumber);


        if (mat.matches()) {
            System.out.format("Country code: %s\n", mat.group(2)); //capture group  (\\d{1,2})  index 2   12
            System.out.format("Area code: %s\n", mat.group(4)); //capture group  (\\d{3}) index 4  232
            System.out.format("Exchange: %s\n", mat.group(6)); //capture group  (\\d{3}) index 6 333
            System.out.format("Line number: %s\n", mat.group(7)); //capture group  (\\d{4}) index 7  2365

            System.out.println(mat.group(0)); // the entire string  "1.232.333.2365"
        }
    }
}
