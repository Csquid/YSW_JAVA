package Chap07_Class_Instance.BankProject;

public class BankAccountPO {
    public String userName;
    public int balance;


    //constructor
    public BankAccountPO() {
        this.balance = 0;
        this.userName = "";
    }

    public BankAccountPO(String nName) {
        this.balance  = 0;
        this.userName = nName;
    }

    public BankAccountPO(String nName, int nMoney) {
        this.balance  = nMoney;
        this.userName = nName;
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

    //이체를 담당
    public void transfer(BankAccountPO nBAP, int amount) {
        if(amount < 0) {
            System.out.println("money < 0");
            return;
        } else {
            this.balance -= amount;
            nBAP.deposit(amount);

            checkBalanceArr(new BankAccountPO[]{ this, nBAP });
        }
    }

    //보유 잔액을 보여줌
    public int checkMyBalance() {
        System.out.println("[" + this.userName + "] Balance: " + this.balance);
        return this.balance;
    }

    public int checkMyBalance(String nName) {
        System.out.println("[" + nName + "] Balance: " + this.balance);
        return this.balance;
    }

    public static void checkBalanceArr(BankAccountPO[] nBAPs) {
        if(nBAPs.length == 0) {
            System.out.println("Bank Account 가 없습니다.");
            return;
        }

        for(int i = 0; i < nBAPs.length; i++) {
            System.out.println("[" + nBAPs[i].userName + "] Balance: " + nBAPs[i].balance);
        }
    }
}
