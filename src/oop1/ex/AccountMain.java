package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account cash = new Account();

        cash.balance = 0;
        cash.deposit(10000);
        cash.withdraw(9000);
        cash.withdraw(2000);
    }
}
