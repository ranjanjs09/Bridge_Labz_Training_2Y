package BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount savings = new SavingsAccount("SA123", "Alice", 10000);
        CurrentAccount current = new CurrentAccount("CA456", "Bob", 5000);

        accounts.add(savings);
        accounts.add(current);

        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Holder Name: " + account.getHolderName());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());
            System.out.println("-------------------------");
        }
    }
}
