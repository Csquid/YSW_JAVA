package Chap10_ClassVariable_ClassMethod;

class NumberPrinter {
    private int myNum = 0;

    static void showInt(int n) {        //Static Method
        System.out.println(n);
    }
    static void showDouble(double n) {
        System.out.println(n);
    }
    void setMyNumber(int n) {
        myNum = n;
    }
    void showMyNumber() {
        showInt(myNum);
    }
}

public class A05_ClassMethod {
    public static void main(String[] args) {
        NumberPrinter.showInt(20);              //Class 이름을 통한 Class Method call
        NumberPrinter np = new NumberPrinter();
        np.showDouble(3.15);                    //Instance 이름을 통해 Class Method call
        np.setMyNumber(75);
        np.showMyNumber();
    }
}
