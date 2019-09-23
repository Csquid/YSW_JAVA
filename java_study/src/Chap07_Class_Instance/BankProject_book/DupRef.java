/*
*
*   Reference
*
*/

package Chap07_Class_Instance.BankProject_book;

public class DupRef {
    public static void main(String[] args) {
        BankAccountPO ref1 = new BankAccountPO();
        BankAccountPO ref2 = ref1;

        ref1.deposit(10000);
        ref1.checkMyBalance();
        ref2.checkMyBalance();

        ref2.withdraw(3000);
        ref1.checkMyBalance();
    }
}
