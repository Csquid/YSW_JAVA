package Chap06_Method;

public class A02_Method_return {
    public static void main(String[] args) {
        returnVoidFunction();
        System.out.println(returnIntFunction());
        System.out.println(returnDoubleFunction());
    }

    //public static [[void]] returnVoidFunction ()
    public static void returnVoidFunction () {
        System.out.println("void Function");
    }

    //public static [[int]] returnIntFunction()
    public static int returnIntFunction() {
        System.out.println("int Function");

        return 10;
    }

    //public static [[double]] returnDoubleFunction()
    public static double returnDoubleFunction() {
        System.out.println("double Function");

        return 1.234;
    }

}
