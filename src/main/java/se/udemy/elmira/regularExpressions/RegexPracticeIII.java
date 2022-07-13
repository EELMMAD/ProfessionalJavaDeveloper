package se.udemy.elmira.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeIII {
    public static void main(String[] args) {

        //?:
        //And so that tells the engine to not remember or to not capture
        // that group that is inside the parentheses.
        String regex = "(?:(\\d{1,2})[-.,\\s]?)?(?:(\\d{3})[-.,\\s]?)(?:(\\d{3})[-.,\\s]?)(\\d{4})";
        String phoneNumber = "12.232.333.2365";
        System.out.println(phoneNumber.matches(regex));

        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(phoneNumber);

        if (mat.matches()) {
            System.out.format("Country code: %s\n", mat.group(1)); //capture group  (\\d{1,2})   12
            System.out.format("Area code: %s\n", mat.group(2)); //capture group  (\\d{3})  232
            System.out.format("Exchange: %s\n", mat.group(3)); //capture group  (\\d{3}) 333
            System.out.format("Line number: %s\n", mat.group(4)); //capture group  (\\d{4}) 2365

            System.out.println(mat.group(0)); // the entire string  "1.232.333.2365"
        }
    }
    }

