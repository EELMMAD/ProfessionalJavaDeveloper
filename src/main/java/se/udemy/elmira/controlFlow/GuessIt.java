package se.udemy.elmira.controlFlow;

import java.util.Random;

public class GuessIt {
    public static void main(String[] args) {  //Conditions with if/Else
        //How can you generate a number and store it in a variable and the number needs to be one, two or three?
        int randomNum = new Random().nextInt(5) + 1;   // Random().nextInt(3); --> [0, 3)      1 is shifting
        System.out.printf("Generated number is: %d%n ", randomNum);

        if (randomNum == 1) {
            System.out.println("The color is RED");
        } else if (randomNum == 2) {
            System.out.println("The color is GREEN");
        } else if (randomNum == 3) {
            System.out.println("The color is Blue");
        } else {
            System.out.println("The Color is POLKA-DOT");
        }
    }
}
