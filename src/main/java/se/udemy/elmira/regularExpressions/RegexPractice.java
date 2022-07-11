package se.udemy.elmira.regularExpressions;

import java.util.Locale;

public class RegexPractice {
    public static void main(String[] args) {
        System.out.println("cat".matches("cat"));   //true
        System.out.println("Cat".matches("cat"));   //false     //.matches() is case sensitive
        System.out.println("Cat".toLowerCase().matches("cat")); //true
        System.out.println("Cat".matches("[cC]at")); //true
        System.out.println("cat".matches("[cC]at")); //true

        System.out.println("bat".matches("[cC]at")); //false
        System.out.println("bat".matches("[cCb]at")); //true
        System.out.println("bat".matches("[cCbB]at")); //true
        System.out.println("Bat".matches("[cCbB]at")); //true


        // now expanding on this, what if we wanted to allow the first letter in this string to be anything
        //ranging from A to F all lowercase A to F.?
        System.out.println("Bat".matches("[abcdef]at"));
        System.out.println("dat".matches("[a-f]at")); //true
        System.out.println("fat".matches("[a-f]at")); //true
        System.out.println("Fat".matches("[a-fA-F]at")); //no space between
        System.out.println("Fat".matches("[aA-fF]at"));
        System.out.println("Fat".matches("[a-fA-F-w-zW-Z]at"));

        //I want to match anything that is NOT starting with a B, for example.
        System.out.println("cat".matches("[^c]")); //every character except lowerCase c //false
        System.out.println("Cat".matches("[^c]at"));// every character except from lowerCase c //true

        //non character
        System.out.println("-at".matches("[^c]at")); //true
        System.out.println("&at".matches("[^c]at"));  //true

        //multiple character             // inside [] just only consider one character
        System.out.println("flat".matches("[^c]at"));  //false //fl is tow character
                                                 //"[^c]at" has to be only three character string
                                                 //"flat" is four character string

        //Negation with a range
        System.out.println("lat".matches("[^a-z]at")); //false
        System.out.println("Lat".matches("[^a-z]at"));  //true

        //So now what we are saying is this pattern should match any string that contains one word character,
        //followed by lowercase at
        System.out.println("Lat".matches("\\wat"));//true
        System.out.println("_at".matches("\\wat"));//true  //underscore
        System.out.println("-at".matches("\\wat"));//false  //hyphen is NOT a word character
        System.out.println("4at".matches("\\wat")); //true
        System.out.println("10at".matches("\\wat")); //false   String is NOT 3 character


        //So now I'm saying match on any string that is three word characters long.
        System.out.println("dat".matches("\\w\\w\\w")); //true
        System.out.println("___".matches("\\w\\w\\w")); //true
        System.out.println("G_T".matches("\\w\\w\\w")); //true

       // There's something that represents numbers or digits as well, and that is slash the backslash d.
        System.out.println("G_T".matches("\\d")); //false
        System.out.println("4".matches("\\d")); //true
        System.out.println("Z".matches("\\d")); //false
        System.out.println("123".matches("\\d\\d\\d")); //true
        System.out.println("1a3".matches("\\d\\d\\d")); //false


        //So obviously, this should not match because our expression is only calling for three digits and now
        //we've got was that 10 digits plus a couple of hyphens as well.
        System.out.println("321-333-7652".matches("\\d\\d\\d")); //false
        System.out.println("321-333-7652".matches("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d"));  //true

        //quantifier in regular expressions
        //how many times we want a particular pattern or expression or character class to match.
        System.out.println("321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}"));   //{number of digits} //true
        System.out.println("1-321-333-7652".matches("\\d{3}-\\d{3}-\\d{4}")); //true   //a leading single digit, followed by a hyphen.
        System.out.println("321.333.7652".matches("\\d{3}-\\d{3}-\\d{4}"));  //false
                               //. periods                     //- hyphens

        // hyphen or a period [-.]   //Either or
        System.out.println("321-333-7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}")); //true   //- hyphen
        System.out.println("321.333.7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}")); //true   //. period

        System.out.println("321,333,7652".matches("\\d{3}[-.]\\d{3}[-.]\\d{4}")); //comma //false
        System.out.println("321,333,7652".matches("\\d{3}[-.,]\\d{3}[-.,]\\d{4}")); //comma added  //true

        //Miv and Match
        // you could mix and match as well, so I can have a hyphen in
        //the first place in a common the second place and this should work.
        System.out.println("321-333,7652".matches("\\d{3}[-.,]\\d{3}[-.,]\\d{4}"));   //true

        //Space
        System.out.println("321 333 7652".matches("\\d{3}[-., ]\\d{3}[-., ]\\d{4}")); //puts space inside brackets
                              //space                          //space       //space         //true

        // \s --> space
        System.out.println("321 333 7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));  //true
        System.out.println("321,333 7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));  //true

        //too many spaces    arbitrary number of spaces
        // false and the reason -> because we're only expecting up to one space or period or a comma
        System.out.println("321     333 7652".matches("\\d{3}[-.,\\s]\\d{3}[-.,\\s]\\d{4}"));  //false


        // + symbol
        //We can do a plus symbol here, so that means one or more of the character class that is in front of
        //that plus symbol in this case, just as this means three of whatever is in front of it.
        System.out.println("321     333 7652".matches("\\d{3}[-.,\\s]+\\d{3}[-.,\\s]+\\d{4}")); //true

        System.out.println("321 333 7652".matches("\\d{3}[-.,\\s]+\\d{3}[-.,\\s]+\\d{4}")); //even if for one space
        System.out.println("3213337652".matches("//d{3}[-.,\\s]+\\d{3}[-.,\\s]+\\d{4}")); //false //no space

        // + --> one or more space
        // * --> zero or more space


        //zero space(no space) or more
        //zero or more of the characters proceeding.
        System.out.println("3213337652".matches("//d{3}[-.,\\s]*\\d{3}[-.,\\s]*\\d{4}")); //true


    }
}

