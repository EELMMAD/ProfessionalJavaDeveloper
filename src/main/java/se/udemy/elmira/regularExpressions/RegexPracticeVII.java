package se.udemy.elmira.regularExpressions;

public class RegexPracticeVII {    //additional character classes
    public static void main(String[] args) {
        System.out.println("doggy".matches(".....")); //true
        //dot in a regular expression -> any character at all.

        System.out.println("doggy".matches("...")); //false
        System.out.println("doggy".matches(".*")); //true  * one or more
        System.out.println("doggy".matches(".+")); //true  + one or more
        System.out.println("doggy".matches(".?")); //false ? zero or one

        System.out.println("doggy".matches("[^abcd]"));  ////false
        //when the carrot symbol is inside of square brackets, this means opposite
        //of or not.   Match any character that isn't in a or a B or C or D.


        //^ --> beginning of a line
        //$ --> end of the line

        System.out.println("doggy".matches("^.....")); //true    //^ --> beginning of a line
        //So this matches because I'm saying start at the beginning of the string
        // or of the line and then five characters of any sort.

        System.out.println("doggy".matches("^.....$")); //true     //$ --> end of the line

        System.out.println("doggy".matches("^..$...")); //false

        // \\b --> boundary       the area between a word character and a non word character
        System.out.println("cat doggy".matches("...\\s\\b....."));  //true

        // \\w --> word characters  --> lower and uppercase letters, numbers and underscore.
        System.out.println("cat doggy".matches("\\w"));  //false
        System.out.println("cat".matches("\\w\\w\\w"));     //true

        // \\W  (capital) --> If I wanted anything other than word characters, I could do slash capital W.
        System.out.println("cat".matches("\\W\\W\\W"));  //false
        System.out.println("---".matches("\\W\\W\\W"));  //true
        //hyphens are not considered word characters.

        //numbers --> are word characters
        System.out.println("123".matches("\\W\\W\\W")); //false

        //  \\d --> digits
        //  \\D --> Non digits
        System.out.println("123".matches("\\d\\d\\d")); //true
        System.out.println("123".matches("\\D\\D\\D")); //false
        System.out.println("abc".matches("\\D\\D\\D")); //true


        // \\s --> space
        // \\S --> Non space characters
        System.out.println(" ".matches("\\s")); //true
        System.out.println(" ".matches("\\S")); //false
        System.out.println("".matches("\\S")); //false  zero character
        //for one character that isn't a space     "" -> zero character -> false

        System.out.println(".".matches("\\S")); //true   // \\S any single
    }
}
