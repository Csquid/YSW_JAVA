package Chap14_Inheritance;

class SuperCLS {
    public SuperCLS() {
        System.out.println("I'm Super Class");
    }
}

class SubCLS extends SuperCLS {
    public SubCLS() {
        System.out.println("I'm Sub Class");
    }
}

public class A02_SuperSubConstructor {
    public static void main(String[] args) {
        new SubCLS();
    }
}