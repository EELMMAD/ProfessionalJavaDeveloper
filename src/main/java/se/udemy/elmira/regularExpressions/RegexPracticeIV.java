package se.udemy.elmira.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeIV {
    public static void main(String[] args) {

        //?:
        //And so that tells the engine to not remember or to not capture
        // that group that is inside the parentheses.

        // named capture groups  --> ?<name of group>     name should be camelCase
        String regex = "(?:(?<countryCode>\\d{1,2})[-.,\\s]?)?(?:(?<areaCode>\\d{3})[-.,\\s]?)(?:(?<exchange>\\d{3})[-.,\\s]?)(?<lineNumber>\\d{4})";
        String phoneNumber = "12.232.333.2365";
        System.out.println(phoneNumber.matches(regex));

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(phoneNumber);

        if (mat.matches()) {
            System.out.format("Country code: %s\n", mat.group("countryCode")); //12
            System.out.format("Area code: %s\n", mat.group("areaCode")); // 232
            System.out.format("Exchange: %s\n", mat.group("exchange")); // 333
            System.out.format("Line number: %s\n", mat.group("lineNumber")); // 2365

            System.out.println(mat.group(0)); // the entire string  "1.232.333.2365"
        }
    }
}
