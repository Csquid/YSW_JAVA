package Chap10_ClassVariable_ClassMethod;

class InstCnt02 {
    // Class Variable은 Instance를 생성 이전에 메모리 공간에 존재한다.
    static int instNum = 100;

    public InstCnt02() {
        instNum++;
        System.out.println("Create Instance: " + instNum);
    }
}

public class A03_OnlyClassNoInstance {
    public static void main(String[] args) {
        InstCnt02.instNum -= 15;
        System.out.println(InstCnt02.instNum);
    }
}
