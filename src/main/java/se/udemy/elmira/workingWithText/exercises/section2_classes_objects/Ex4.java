package se.udemy.elmira.workingWithText.exercises.section2_classes_objects;

public class Ex4 {
    public static void main(String[] args) {
       /*
    4. Try creating an array to represent the tic-tac-toe board to the right.
    4.1.How would you access the value in the bottom right square with
    Java code?
     */
     char[][] ticToeBoard = {
             {'O','X','X'},
             {'X','O','O'},
             {'X','O','O'}
     };
        System.out.println(ticToeBoard[2][2]); // How would you access the bottom right square?
    }
}
