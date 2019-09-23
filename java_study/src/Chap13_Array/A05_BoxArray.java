package Chap13_Array;

class Box02 {
    private String conts;

    Box02(String cont) {
        this.conts = cont;
    }

//    public String toString() {
//        return this.conts;
//    }
}

public class A05_BoxArray {
    public static void main(String[] args) {
        Box02[] ar = new Box02[3];

        System.out.println(ar);

        ar[0] = new Box02("First");
        ar[1] = new Box02("Second");
        ar[2] = new Box02("Third");

        System.out.println(ar[0]);
        System.out.println(ar[1]);
        System.out.println(ar[2]);

    }
}
