package se.udemy.elmira.workingWithText.stringConcatenation;

public class LearnStringsB {
    public static void main(String[] args) {
        String myText = "apple";
        String myNewText = myText.substring(1);
        System.out.println(myNewText);

        System.out.println("0---------");
        String text1 = "apple";
        String text2 = text1.substring(0, 1); //1 --> length --> index of the character when we want to stop
        // go up to NOT including
        System.out.println(text2);

        System.out.println("1---------");
        String text3 = "apple";
        String text4 = text3.substring(0, 1).toUpperCase();
        System.out.println(text4);

        System.out.println("2---------");
        String text5 = "apple";
        String text6 = text5.substring(0, 1).toUpperCase() + text5.substring(1);
        System.out.println(text6);

        System.out.println("3---------");
        String text7 = "apple";
        String text8 = text7.substring(0, 1).toUpperCase().concat(text7.substring(1));
        System.out.println(text8);

        System.out.println("4---------");
        String text9 = "apple";
        String firstPart = text9.substring(0, 1);
        String secondPart = text9.substring(1);
        String text10 = firstPart.toUpperCase().concat(secondPart);
        System.out.println(text10);

        System.out.println("5---------");
        String text11 = "apple";
        String firstPart1 = text11.substring(0, 1);
        String secondPart1 = text11.substring(1);
        String capitalFirstLetter = firstPart1.toUpperCase();
        String text12 = capitalFirstLetter.concat(secondPart1);
        System.out.println(text12);

        System.out.println("6---------");
        String text13 = "apple";
        String firstPart2 = text13.substring(0, 1);
        String secondPart2 = text13.substring(1);
        String capitalFirstLetter1 = firstPart2.toUpperCase();
        String myNewText1 = new StringBuilder(capitalFirstLetter1).append(secondPart2).toString();
        System.out.println(myNewText1);

        System.out.println("7---------");
        String text14 = "apple";
        String firstPart3 = text14.substring(0, 1);
        String secondPart3 = text14.substring(1);
        String capitalFirstLetter2 = firstPart3.toUpperCase();
        String myNewText2 = new StringBuilder()    //No argument StringBuilder
                .append(capitalFirstLetter2)
                .append(secondPart3)
                .toString();
        System.out.println(myNewText2);

        System.out.println("8---------");
        String text15 = "apple";
        String firstPart4 = text15.substring(0, 1);
        String secondPart4 = text15.substring(1);
        String capitalFirstLetter3 = firstPart4.toUpperCase();
        int totalLength = capitalFirstLetter3.length() + secondPart4.length();
        String myNewText3 = new StringBuilder(totalLength)
                //The StringBuilder will be hyper optimized with its use of memory
                .append(capitalFirstLetter3)
                .append(secondPart4)
                .toString();
        System.out.println(myNewText3);

    }
}

