package se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex8;

import se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex8.Bank.Bank;
import se.udemy.elmira.workingWithText.exercises.section2_classes_objects.ex8.Bank.BankManager;

public class Customer {
    public void accessBankVault(Bank bank){
        //        bank.accessVault(); // If you uncomment this method (remove // from beginning of this line), you'll have an error
        //        because bank.accessVault() is package protected & customer is not in the bank package
    }

    public void accessBankVault(BankManager manager, Bank bank) {
        manager.accessVault(bank);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Bank bank = new Bank();
        BankManager manager = new BankManager();

        customer.accessBankVault(bank); // This way won't work. cmd/ctrl-click on .accessBankVault to see why
        customer.accessBankVault(manager, bank); // This way DOES work because manager IS allowed to access Bank.accessVault()
    }
}
