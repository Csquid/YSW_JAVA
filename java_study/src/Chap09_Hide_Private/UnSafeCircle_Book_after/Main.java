package Chap09_Hide_Private.UnSafeCircle_Book_after;

public class Main {
    public static void main(String[] args) {
        CirCle cc01 = new CirCle(1.5);
        System.out.println("Rad: "  + cc01.getRad());
        System.out.println("Area: " + cc01.getArea());

        //잘못된 접근
        //cc01.rad = -4.5;      //ERROR

        cc01.setRad(3.4);
        System.out.println("Rad: "  + cc01.getRad());
        System.out.println("Area: " + cc01.getArea());
    }
}
