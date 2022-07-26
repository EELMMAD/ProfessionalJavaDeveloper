package se.udemy.elmira.controlFlow;

public class GuessItIII {
    public static void main(String[] args) {
        String command = "null";

        /*
        switch (command){
            case "stop":
                System.out.println("Stopping now...");
                break;
            case"go":
                System.out.println("Going now...");
                break;
            default:
                System.out.println("Command not understood...");
        }
         */

        if ("stop".equals(command)) {            //no exception any more
            System.out.println("Stopping now...");
        } else if ("go".equals(command)) {
            System.out.println("Going now...");
        } else {
            System.out.println("Command not understood...");
        }
    }
}
