package se.udemy.elmira.workingWithText.stringConcatenation;

public class LearnStringsB {
    public static void main(String[] args) {
        String myText = "apple";
        String myNewText = myText.substring(1);
        System.out.println(myNewText);

        System.out.println("---------");
        String text1 = "apple";
        String text2 = text1.substring(0, 1); //1 --> length --> index of the character when we want to stop
                                              // go up to NOT including
        System.out.println(text2);

        System.out.println("---------");
        String text3 = "apple";
        String text4 = text3.substring(0, 1).toUpperCase();
        System.out.println(text4);

        System.out.println("---------");
        String text5 = "apple";
        String text6 = text5.substring(0, 1).toUpperCase() + text5.substring(1);
        System.out.println(text6);

        System.out.println("---------");
        String text7 = "apple";
        String text8 = text7.substring(0, 1).toUpperCase().concat(text7.substring(1));
        System.out.println(text8);
    }
}
