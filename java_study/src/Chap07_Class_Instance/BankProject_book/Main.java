package Chap07_Class_Instance.BankProject_book;

public class Main {
    public static void main(String[] args) {
        BankAccountPO bap01 = new BankAccountPO();
        BankAccountPO bap02 = new BankAccountPO();

        //각 인스턴스를 대상으로 예금을 진행
        bap01.deposit(5000);
        bap02.deposit(3000);

        //각 인스턴스를 대상으로 출금을 진행
        bap01.withdraw(2000);
        bap02.withdraw(2000);

        //각 인스턴스를 대상으로 잔액을 조회
        bap01.checkMyBalance();
        bap02.checkMyBalance();
    }
}
