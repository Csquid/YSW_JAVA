package Chap11_MethodOverloading_StringClass;

public class B01_String_Test {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println(str1);

        str1 = "efg";

        System.out.println(str1);
        System.out.println(str2);
        //str1[0] = "b";
        //str2[1] = "c";
        //str3[2] = "d";
    }
}
