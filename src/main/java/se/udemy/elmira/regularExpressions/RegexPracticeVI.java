package se.udemy.elmira.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeVI {
    public static void main(String[] args) {

        //Wrapping Up Phone Number Parsing  \\(?   \\)?

        String regex = "(?:(?<countryCode>\\d{1,2})[-.,\\s]?)?(?:\\(?(?<areaCode>\\d{3})\\)?[-.,\\s]?)(?:(?<exchange>\\d{3})[-.,\\s]?)(?<lineNumber>\\d{4})";
        String phoneNumber = "(232) 333-2365";


        //#This is my regex to parts of a phone number
        // String regex = """
        // (?:\\((?<countryCode>\\d{1,2})[-.,\\s]?)?   #Get's country code
        // (?:(?<areaCode>\\d{3})[-.,\\s]?)   #Get's area code
        // (?:(?<exchange>\\d{3})[-.,\\s]?)  #Get's exchange
        // (?<lineNumber>\\d{4}) #Get's line number
        // """;

        //  String phoneNumber = "12.232.333.2365""";


        Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);  //ignore spaces - white space.
        Matcher mat = pat.matcher(phoneNumber);

        // System.out.println(phoneNumber.matches(regex));
        if (mat.matches()) {
            System.out.format("Country code: %s\n", mat.group("countryCode")); //12
            System.out.format("Area code: %s\n", mat.group("areaCode")); // 232
            System.out.format("Exchange: %s\n", mat.group("exchange")); // 333
            System.out.format("Line number: %s\n", mat.group("lineNumber")); // 236
            System.out.println(mat.group(0)); // the entire string  "1.232.333.2365"
        }
    }
}

