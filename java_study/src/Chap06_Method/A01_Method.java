package Chap06_Method;

public class A01_Method {
    public static void main(String[] args) {
        System.out.println("start program \n");

        printAge(12);
        printAge(13);

        System.out.println("program end");
    }

    //public static [void] printAge(int nAge)
    // [void] 가 있는 장소가 반환형을 의미한다.
    public static void printAge(int nAge) {
        if(nAge < 0) {
            System.out.println("값이 올바르지 않습니다.");
            return;
        }

        System.out.println("good morning");
        System.out.println("my age is " +  nAge);
    }
}
