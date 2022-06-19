package se.udemy.elmira.workingWithText.People;

public class LearnStringsD {
    public static void main(String[] args) {
        //Space in the beginning of the string --> leading space
        // space in the end of the string --> trailing space
        String firstName = "   Jake  ";

        //strip() --> remove the leading and the trailing spaces
        // System.out.format("'%s'", firstName.strip());

        //stripLeading() --> it is just and only removes the LEADING space and
        //doesNOT touch the trailing space
        //System.out.format("'%s'", firstName.stripLeading());

        //stripTrailing()) --> it is just and only removes the TRAILING space and
        //doesNOT touch the leading space
        //System.out.format("'%s'", firstName.stripTrailing());

        // System.out.format("'%s'", firstName.stripIndent());
        System.out.format("'%s'", firstName.trim());
        System.out.println();

        System.out.println("---------");
        System.out.format("'%s'", split(firstName));
    }

    public static String split(String text) {
        return text.replace(" ", "");
    }
}
