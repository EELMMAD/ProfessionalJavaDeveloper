package se.udemy.elmira.Numbers.exercise;

public class Ex11 {
    /*
    11. Write a method that takes the String inputs, “37” & “13”, and returns an integer of their
     sum, 50.
     */
    private static int addStringIntegers(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return n1 + n2;
    }

    public static void main(String[] args) {
        System.out.println(addStringIntegers("37", "13"));
    }

}
