package se.udemy.elmira.workingWithText.stringConcatenation;

public class LearnStringsA {
    public static void main(String[] args) {
        String myText = "for score and seven years ago";
        System.out.println(myText.length());

        char[] chars = myText.toCharArray();
        int index = 1000;
        if (index < myText.length()) {
            System.out.println(chars[index]);
        }

        System.out.println("---------");
        String firstText = "for";
        String secondText = "score";
        StringBuilder builder = new StringBuilder(firstText.length() + secondText.length())//supply exact length
                .append(firstText)
                .append(secondText);
        System.out.println(builder.toString());
    }
}
