package se.udemy.elmira.controlFlow.doWhileLoop;

import java.util.Random;

public class GuessItI {
    public static void main(String[] args) { //Do/While part one
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
                    wrongGuessCount ++;
                    System.out.printf("You did not get it!%n");
                }
            }
        }while (!"q".equals(guessedNumText));
    }
}
