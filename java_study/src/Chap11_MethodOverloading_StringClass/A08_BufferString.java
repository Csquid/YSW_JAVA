package Chap11_MethodOverloading_StringClass;

public class A08_BufferString {
    public static void main(String[] args) {
        StringBuffer stbuf = new StringBuffer("123");

        stbuf.append(45678);
        System.out.println(stbuf);
        System.out.println(stbuf.getClass());
        System.out.println(stbuf.toString().getClass());
    }
}
