package Chap01_Basic;

public class A03_Type_Conversion {
    public static void main(String[] args) {
        double pi    = 3.1415;
        int conInt01 = (int)pi;

        long lNum01  = 3000000;
        int conInt02 = (int)lNum01;

        short sNum01 = 1;
        short sNum02 = 2;

        /*
        *  덧셈 연산을 위해서 num1 과 num2에 저장된 값이 int 형으로 변환되어 메모리 공간에 임시 저장 된다.
        *  그리고 덧셈이 이뤄져 그 결과가 만들어진다.
        *  그런데 그 결과는 int 형이므로 대입의 과정에서 문제가 발생한다.
        *  그러한 이유로 short 형을 서로 더하여 short 변수에 넣기위해선 short 형변환을 해 주어야한다.
        */
        //short sNum03 = sNum01 + sNum02;
        short sNum03 = (short)(sNum01 + sNum02);
    }
}
