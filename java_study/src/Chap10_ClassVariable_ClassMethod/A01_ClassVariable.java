package Chap10_ClassVariable_ClassMethod;

class InstCnt01 {
    //instNum = instance Number
    static int instNum = 0;

    public InstCnt01() {
        instNum++;
        System.out.println("Create Instance " + instNum);
    }
}

public class A01_ClassVariable {
    public static void main(String[] args) {
        InstCnt01 cnt1 = new InstCnt01();
        InstCnt01 cnt2 = new InstCnt01();
        InstCnt01 cnt3 = new InstCnt01();
    }
}
