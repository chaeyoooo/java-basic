package oop1.ex;

public class Account {
    int balance;

    // 입금 메서드
    int deposit(int amount){
        balance += amount;
        return balance;
    }
    int withdraw(int amount){
        if(balance < amount){
            System.out.println("잔액부족");
            System.out.println("잔고 : " + balance);
            return balance;
        }
        balance -= amount;
        return balance;
    }
}
