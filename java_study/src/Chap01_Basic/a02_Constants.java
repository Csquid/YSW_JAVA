package Chap01_Basic;

public class a02_Constants {
    public static void main(String[] args) {
        final int MAX_SIZE       = 100;
        final char CONST_CHAR    = 'a';
        final int CONST_ASSIGNED = 12;
        //CONST_ASSIGNED = 11;      //재할당 에러

        System.out.println("constant Max_Size: "       + MAX_SIZE);
        System.out.println("constant Const_Char: "     + CONST_CHAR);
        System.out.println("constant Const_Assigned: " + CONST_ASSIGNED);
    }
}
