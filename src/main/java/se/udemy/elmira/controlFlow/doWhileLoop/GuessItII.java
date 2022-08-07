package se.udemy.elmira.controlFlow.doWhileLoop;

import java.util.Random;

public class GuessItII {//Do/While part two

    public static final int MAX_ALLOWED_TRIED = 4;

    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1; //[0, 10) + 1 --> [1, 10]
        System.out.printf("Random number is %d.%n,  ", randomNum);
        String guessedNumText = null;
        int wrongGuessCount = 1;
        do {
            guessedNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if (guessedNumText.matches("-?\\d{1,2}")) { //? -> 0 or 1
                int guessedNum = Integer.parseInt(guessedNumText);
                if (guessedNum == randomNum) {
                    String tryText = wrongGuessCount == 1 ? "try" : "tries";
                    System.out.printf("The random number was %d. you got it in %d %s!%n", randomNum, wrongGuessCount, tryText);
                    return;
                } else {
                    System.out.printf("You did not get it!%n");
                    wrongGuessCount++;
                }
            }
        } while (!"q".equals(guessedNumText) && wrongGuessCount <= MAX_ALLOWED_TRIED);
        //didn't press q = 1, less than 4 wrong guesses = 1 --> loop continues
        //didn't press q = 1, more than 4 wrong guesses = 0 --> loop stops
        //DID press q = 0, less than 4 wrong guesses = 1 --> loop stops
        //DID press q = 0, more than 4 wrong guesses = 0 --> loop stops
        if (wrongGuessCount >= MAX_ALLOWED_TRIED) {
            System.out.printf("You've had %d incorrect guesses. The random number is %d. Ending program now.", wrongGuessCount - 1, randomNum);
        }
    }
}
