package se.udemy.elmira.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeopleMatching {   //Finding multiple matches

    public static void main(String[] args) {
        /*
        String people = """
                Flinstone, Fred, 1/1/1900
                Rubble, Barny, 2,3,1950
                Filnstone, Wilma, 3/3/1910
                Rubble, Betty, 4/4/1915
                """;

        String regex = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{4}\\n)"; //3 capture group
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(people);

        //But we can tell it to skip over a certain number of characters, according to their index, and then
        //
        //start from there.
        //you can skip past certain parts.
        mat.find(35);
        System.out.println(mat.group("firstName"));
        System.out.println(mat.group("lastName"));
        System.out.println(mat.group("dob"));
        System.out.println(mat.start()); //51
        System.out.println(mat.end()); //78
        System.out.println(mat.start("firstName")); //62  this will tell us the index of where Wilma's first name began
        System.out.println(mat.end("firstName"));  //67

        /*
       // mat.find();     //should match with regex
        //Any text in this total string that matches this pattern?
        //
        //And if it finds an instance that matches it, zeroes in on that.
        //
        //And then each of the subsequent methods like Match Dot Group will match to just that one instance ofif we don't supply an input to the find method, it will start at the beginning
        //
        //of the string to look for matches.
        //
        // if we don't supply an input to the find method, it will start at the beginning
        //
        //of the string to look for matches.

        mat.find();
        System.out.println(mat.group("firstName")); //Flinstone
        System.out.println(mat.group("lastName"));  //Fred
        System.out.println(mat.group("dob"));       //1/1/1900

        mat.find();
        System.out.println(mat.group("firstName")); //Rubble
        System.out.println(mat.group("lastName")); //Barny
        System.out.println(mat.group("dob")); //2,3,1950

        mat.find();
        System.out.println(mat.group("firstName")); //Filnstone
        System.out.println(mat.group("lastName"));  //Wilma
        System.out.println(mat.group("dob"));  //3/3/1910

        mat.find();
        System.out.println(mat.group("firstName"));  //Rubble
        System.out.println(mat.group("lastName"));  //Betty
        System.out.println(mat.group("dob"));    //4/4/1915
         */

    }
}


