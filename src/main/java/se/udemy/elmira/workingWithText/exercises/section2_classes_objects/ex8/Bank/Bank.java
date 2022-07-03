package se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex8.Bank;

public class Bank {
        /*
        8. Model a Bank with the ability to access the vault. Model a BankManager and a Customer
         too. Ensure the Customer can not access the Bank’s vault directly but the BankManager can
        */

    /* Notice this method does not have public or private keywords
     (protected would also work). Without those, it is 'package protected'. */
     void accessVault(){
         System.out.println("You are in the vault now.");
     }
}
