package se.udemy.elmira.controlFlow;

import java.util.Random;

public class GuessItII {
    public static void main(String[] args) {
        int randomNum = new Random().nextInt(5) + 1;
        System.out.printf("Generated number is: %d, %n", randomNum);

        /*
        if(randomNum == 1){
            System.out.println("The color is RED");
        }else if (randomNum == 2){
            System.out.println("The color is BLE");
        }else if(randomNum == 3){
            System.out.println("The color is GREEN");
        }else if(randomNum == 4){
            System.out.println("The color is PURPLE");
        }else{
            System.out.println("The color is WHATEVER");
        }
         */

        switch (randomNum) {
            case 1:
                System.out.println("The color is RED");
                break;
            case 2:
                System.out.println("The color is BLUE");
                break;
            case 3:
                System.out.println("The color is Green");
                break;
            case 4:
                System.out.println("The color is PURPLE");
                break;
            default:
                System.out.println("The color is WHATEVER");
                break;
        }
    }
}
