package se.udemy.elmira.controlFlow.whileLoop;

import java.util.Random;

public class GuessIt {  //while loop part one
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(10) + 1; //[0, 10) + 1 --> [1, 10]
        String guessedNumText = null;
        while (!"q".equals(guessedNumText)) {
             guessedNumText = System.console().readLine("Please guess a number between 1 and 10 inclusively: ");
            if (guessedNumText.matches("-?\\d{1,2}")) { //? -> 0 or 1
                int guessedNum = Integer.parseInt(guessedNumText);
                if (guessedNum == randomNum) {
                    System.out.printf("The random number was %d. you got it!%n", randomNum);
                    return;
                } else {
                    System.out.printf("You did not get it!%n");
                }
            }
        }
    }
}
