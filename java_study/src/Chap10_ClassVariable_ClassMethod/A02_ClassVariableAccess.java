package Chap10_ClassVariable_ClassMethod;

class AccessWay {
    static int num = 0;

    AccessWay() {
        this.incrCnt();
    }
    private void incrCnt() {
        num++;          //클래스 내부에서 이름을 통해 접근
    }
    private void incrCnt(int nNumber) { }
}

public class A02_ClassVariableAccess {
    public static void main(String[] args) {
        AccessWay way = new AccessWay();
        way.num++;
        AccessWay.num++;
        System.out.println("num: " + AccessWay.num);
    }
}
