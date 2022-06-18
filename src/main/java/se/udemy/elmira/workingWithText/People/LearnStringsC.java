package se.udemy.elmira.workingWithText.People;

public class LearnStringsC {
    public static void main(String[] args) {
        String myText = "Here's my awesome firf text";
        System.out.println(myText);
        System.out.println(myText.replace("firf", "nice"));

        System.out.println("-------------------");
        String myText1 = "Here's firf my awesome firf text";
        System.out.println(myText1);
        System.out.println(myText1.replace("firf", "nice"));
        System.out.println(myText1.replace("FIRF", "nice"));

        System.out.println("-------------------");
        String myText2 = "Here's firf my awesome firf text";
        System.out.println(myText2.replace('e', 'Z'));
    }
}
