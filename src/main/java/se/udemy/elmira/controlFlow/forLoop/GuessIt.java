package se.udemy.elmira.controlFlow.forLoop;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;

public class GuessIt {  //For loop
    public static final int MAX_ALLOWED_TRIED = 4;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1; //[0, 10) + 1 --> [1, 10]
        System.out.printf("Random number is %d.%n,  ", randomNum);
        String guessedNumText = null;

        int wrongGuessCount = 1;
        for (; wrongGuessCount <= MAX_ALLOWED_TRIED; wrongGuessCount++) {
            guessedNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if (guessedNumText.matches("-?\\d{1,2}")) { //? -> 0 or 1
                int guessedNum = Integer.parseInt(guessedNumText);
                if (guessedNum == randomNum) {
                    String tryText = wrongGuessCount == 1 ? "try" : "tries";
                    System.out.printf("The random number was %d. you got it in %d %s!%n", randomNum, wrongGuessCount, tryText);
                    break;
                } else {
                    if (LocalDate.now().getDayOfWeek().equals(DayOfWeek.MONDAY))
                        System.out.printf("You did not get it!%n");
                    continue;
                }
            }
        }
        if (wrongGuessCount >= MAX_ALLOWED_TRIED) {
            System.out.printf("You've had %d incorrect guesses. The random number is %d. Ending program now.", wrongGuessCount - 1, randomNum);
        }
        System.out.println("Program ended...");
    }
}
