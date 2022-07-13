package IfAndTest;

public class BankAccount {
    int balance;

    public BankAccount(int balance){
        this.balance=balance;
    }

    void deposit(int amount){
        balance +=amount;
    }
    void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
}
