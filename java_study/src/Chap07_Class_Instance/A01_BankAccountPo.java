package Chap07_Class_Instance;

public class A01_BankAccountPo {

    //예금 잔액
    static int balance = 0;
    public static void main(String[] args) {
        deposit(10000);
        checkMyBalance();
        withdraw(3000);
        checkMyBalance();
    }

    //입금을 담당
    public static int deposit(int amount) {
        balance += amount;
        return balance;
    }

    //출금을 담당
    public static int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public static int checkMyBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }
}
