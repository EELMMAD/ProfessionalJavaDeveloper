package se.udemy.elmira.workingWithText.stringConcatenation;

public class LearnStringsD {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        System.out.println(fileName.endsWith("txt")); //endsWith()--> returns boolean
        System.out.println(fileName.endsWith("doc"));

        String fileName1 = "    file001.txt";  //space matters
       // String fileName1 = "    file001.txt".strip();
        System.out.println(fileName1.startsWith("file"));
        //System.out.println(fileName1.strip().startsWith("file"));

       // String strippedString = fileName.strip();
       // System.out.println(strippedString.startsWith("file"));

        System.out.println(fileName1.startsWith("az"));
    }
}
