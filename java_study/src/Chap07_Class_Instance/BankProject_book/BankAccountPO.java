package Chap07_Class_Instance.BankProject_book;

public class BankAccountPO {
    private int balance;

    public BankAccountPO() {}
    public BankAccountPO(int nMoney) {
        this.balance = nMoney;
    }
    //입금을 담당
    public int deposit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    //출금을 담당
    public int withdraw(int amount) {
        this.balance -= amount;
        return this.balance;
    }

    public int checkMyBalance() {
        System.out.println("Balance: " + this.balance);
        return this.balance;
    }

}
