package Chap11_MethodOverloading_StringClass;

public class C01_Regis {
    public static void main(String[] args) {
        String registerNumber = new String("990925-1012999");

        String changeRegisterNumber01 = registerNumber.substring(0, 6) + " " + registerNumber.substring(7);
        String changeRegisterNumber02 = registerNumber.replaceAll("-", " ");

        System.out.println(changeRegisterNumber01);
        System.out.println(changeRegisterNumber02);
    }
}
