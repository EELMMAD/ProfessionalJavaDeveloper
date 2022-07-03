package se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex8.Bank;

public class BankManager {
    public void accessVault(Bank bank) {
        bank.accessVault(); // Perfectly fine here because Manager & Bank are in the same package and Bank.accessVault is package protected
    }
}
