package se.udemy.elmira.workingWithText.stringConcatenation;

import java.util.Arrays;

public class TextLearning {
    //Take the data from spreadsheet(Execel)
    public static void main(String[] args) { // """   """ --> multi line text String
        /*
        String text = """
               Smith,Fred,1/1/79,1111 ABC St.,Apple,CA
               McGuire,Jerry,2/2/80, 2222 DEF St.,Orange,NV
               Flintstone,Fred,3/3/81,3333 GHI St.,Pear,MO
               Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL
               Jetson,George,5/5/83,5555 MNO St.,Grapefruti,NY
                """;
        String[] people = text.split("\n", 3);
        System.out.println(people.length);
        System.out.println(people[2]);
        String[] george = people[2].split(",");
        System.out.println(george[3]);
         */

        String[] text = {"Smith,Fred,1/1/79,1111 ABC St.,Apple,CA} ",
                      "McGuire,Jerry,2/2/80, 2222 DEF St.,Orange,NV" ,
                      "Flintstone,Fred,3/3/81,3333 GHI St.,Pear,MO" ,
                      "Rubble,Barney,4/4/82,4444 JKL St.,Pineapple,IL ",
                      " Jetson,George,5/5/83,5555 MNO St.,Grapefruti,NY"};

        System.out.println(text[4]);
    }
}
