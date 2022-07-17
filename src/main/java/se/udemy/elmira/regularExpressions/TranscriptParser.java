package se.udemy.elmira.regularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranscriptParser {
    public static void main(String[] args) {
        String transcript = """
                Student Number:	1234598872			Grade:		11
                Birthdate:		01/02/2000			Gender:	M
                State ID:		8923827123
                                
                Cumulative GPA (Weighted)		3.82
                Cumulative GPA (Unweighted)	3.46
                """;
        //. any character
        //* zero or more
        //+ one or more
        //{1,2} between one or two characters
        //.* -> string will just be zero or more characters that we don't care about.
        //Pattern.DOTALL --> matches few more things that is normally would
        // Pattern.DOTALL --> enabling comments
        // \\b --> boundary is just the area between a word character and a non word character.

        //in end of line 31 ---> ? --> So that is to say it started here at the boundary and then
        // it went forward until it found the word cumulative

        String regex = """
                Student\\sNumber:\\s(?<studentNum>\\d{10}).*  # Grab student number
                Grade:\\s+(?<grade>\\d{1,2}).*  # Grab the grade
                Birthdate:\\s+(?<birthMonth>\\d{2})/(?<birthDay>\\d{2})/(?<birthYear>\\d{4}).*  # Grab birthdate
                Gender:\\s+(?<gender>\\w+)\\b.*  # Grab the gender
                State\\sID:\\s+(?<stateID>\\d+)\\b.*? # Grab the state ID  
                Cumulative.*?(?<weightedGPA>[\\d\\.]+)\\b.*  # Grab the weighted GPA
                #Weighted\\)\\s+(?<weightedGPA>[\\d\\.]+)\\b.*  # Grab the weighted GPA
                #Unweighted\\)\\s+(?<unweightedGPA>[\\d\\.]+)\\b.*  # Grab the unweighted GPA
                """;
        Pattern pat = Pattern.compile(regex, Pattern.DOTALL | Pattern.COMMENTS);

        Matcher mat = pat.matcher(transcript);
        if (mat.matches()) {
            System.out.println(mat.group("studentNum"));
            System.out.println(mat.group("grade"));
            System.out.println(mat.group("birthMonth"));
            System.out.println(mat.group("birthDay"));
            System.out.println(mat.group("birthYear"));
            System.out.println(mat.group("gender"));
            System.out.println(mat.group("stateId"));
            System.out.println(mat.group("weightedGPA"));
            //System.out.println(mat.group("unweightedGPA"));
        }
    }
}