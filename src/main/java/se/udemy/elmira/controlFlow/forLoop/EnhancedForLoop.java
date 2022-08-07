package se.udemy.elmira.controlFlow.forLoop;

public class EnhancedForLoop { // A enhanced for loop
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "pear", "plum"};
        for (String fruit : fruits) {
            System.out.printf("The current fruit is %s%n", fruit);
        }

        /*
        for(int counter = 0; counter<fruits.length; counter++){
            System.out.printf("The current fruit is %s%n", fruits[counter]);
        }
         */
    }
}
