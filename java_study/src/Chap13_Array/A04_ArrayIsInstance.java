package Chap13_Array;

class Box01 {
    private String conts;

    Box01(String cont) {
        this.conts = cont;
    }

    public String toString() {
        return conts;
    }
}

public class A04_ArrayIsInstance {
    public static void main(String[] args) {
        Box01[] ar = new Box01[5];
        System.out.println("length: " + ar.length);
        System.out.println(ar[0]);
    }
}
