package se.udemy.elmira.controlFlow;

import java.util.Random;

public class GuessItI { //Control Flow Inequalities
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5) + 1;
        System.out.printf("Generated number is: %d, %n", randomNum);

        if (randomNum <= 2) { // 1 2 3 4 5 6 7 8
            System.out.println("The color is RED");
        } else if (randomNum >= 4 && (randomNum % 2 == 0)) {  //even number
            System.out.println("The color is BLUE");
        } else {
            System.out.println("The color is GREEN ");
        }
    }
}
