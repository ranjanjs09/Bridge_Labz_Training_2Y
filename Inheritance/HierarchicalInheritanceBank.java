/**
 * HierarchicalInheritanceBank.java
 * Demonstrates hierarchical inheritance with BankAccount superclass and SavingsAccount, CheckingAccount, FixedDepositAccount subclasses.
 */

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayAccountType() {
        System.out.println("Generic Bank Account");
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Savings Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Checking Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    private int depositPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int depositPeriod) {
        super(accountNumber, balance);
        this.depositPeriod = depositPeriod;
    }

    @Override
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Deposit Period: " + depositPeriod + " months");
    }
}

public class HierarchicalInheritanceBank {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 12);

        savings.displayAccountType();
        savings.displayAccountDetails();
        System.out.println();

        checking.displayAccountType();
        checking.displayAccountDetails();
        System.out.println();

        fixedDeposit.displayAccountType();
        fixedDeposit.displayAccountDetails();
    }
}
