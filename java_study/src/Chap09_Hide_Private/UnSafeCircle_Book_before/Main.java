package Chap09_Hide_Private.UnSafeCircle_Book_before;

public class Main {
    public static void main(String[] args) {
        CirCle cc01 = new CirCle(1.5);
        System.out.println(cc01.getArea());

        cc01.setRad(2.5);
        System.out.println(cc01.getArea());

        //r < 0 --> rad = 0
        cc01.setRad(-3.3);
        System.out.println(cc01.getArea());

        //잘못된 접근
        cc01.rad = -4.5;
        System.out.println(cc01.getArea());
    }
}
