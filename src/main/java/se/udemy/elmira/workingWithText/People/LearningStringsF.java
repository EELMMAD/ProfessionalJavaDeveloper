package se.udemy.elmira.workingWithText.People;

public class LearningStringsF {
    public static void main(String[] args) {

        //compareTo();

        //*If the first string comes before the second string
        //compareTo() method returns a negative number

        //*If the first string is he same az second string
        //then compareTo() method return Zero

        //*If the first string comes after the second string
        //compareTo method returns a positive number

        String firstWord = "Apple";
        String secondWord = "Banana";

        System.out.println(firstWord.compareTo(secondWord));
        System.out.println("_________________________");

        String thirdWord = "Apple";
        String fourthWord = "Apple";

        System.out.println(thirdWord.compareTo(fourthWord));
        System.out.println("_________________________");

        String fifthWord = "Apple";
        String sixthWord = "Aardvark";

        System.out.println(fifthWord.compareTo(sixthWord));
        System.out.println("_________________________");
        String seventhWord = "Apple";
        String eighthWord = "apple";

        System.out.println(seventhWord.compareToIgnoreCase(eighthWord));

        System.out.println("_________________________");
        String nightWord = "Apple";
        String tenthWord = "apple";

        System.out.println(compareToIgnoreCase(nightWord, tenthWord));
    }

    public static int compareToIgnoreCase(String text1, String text2) {
        String lowerText1 = text1.toLowerCase();
        String lowerText2 = text2.toLowerCase();

        return lowerText1.compareTo(lowerText2);
    }
}
