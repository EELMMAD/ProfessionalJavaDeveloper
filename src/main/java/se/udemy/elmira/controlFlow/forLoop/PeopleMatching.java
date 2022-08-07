package se.udemy.elmira.controlFlow.forLoop;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching { //apply loop to regexappl
    /*
    public static void main(String[] args) {
        String people = """
                Flinstone, Fred, 1/1/1900
                Rubble, Barny, 2,3,1950
                Filnstone, Wilma, 3/3/1910
                Rubble, Betty, 4/4/1915
                """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{4}\\n)";
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);


        while (mat.find()) {
            System.out.println("%s %s %s%n", mat.group("firstName"), mat.group("lastName"), mat.group("dob"));
        }
    }
     */
}
