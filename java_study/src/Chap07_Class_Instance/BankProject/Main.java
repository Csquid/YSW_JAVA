package Chap07_Class_Instance.BankProject;

public class Main {
    public static void main(String[] args) {
        BankAccountPO bap01 = new BankAccountPO("bap01");
        BankAccountPO bap02 = new BankAccountPO("bap02");
        BankAccountPO bap03 = new BankAccountPO("bap03");
    
        //BankAccountPO[] bapArr01 = new BankAccountPO[2];
        //BankAccountPO[] bapArr02 = new BankAccountPO[]{ bap01, bap02 };

        bap01.deposit(10000);
        bap02.deposit(10000);
        bap03.deposit(100000);

        bap01.transfer(bap02, 3000);

        bap01.checkMyBalance("bap01");
        bap02.checkMyBalance("bap02");

        BankAccountPO.checkBalanceArr(new BankAccountPO[]{ bap01, bap02, bap03 });
        BankAccountPO.checkBalanceArr(new BankAccountPO[]{});
        //bap01.withdraw(3000);
        //bap01.checkMyBalance();
    }
}
