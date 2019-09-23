package Chap10_ClassVariable_ClassMethod;

class Circle {
    static final double PI = 3.1415;        //변하지 않는, 참조가 목적인 값
    private double radius;

    public Circle(double rad) {
        this.radius = rad;
    }
    void showPerimeter() {
        double peri = (this.radius * 2) * PI;
        System.out.println("Perimeter: " + peri);
    }
    void showArea() {
        double area = (radius * radius) * PI;
        System.out.println("Area: " + area);
    }
}

public class A04_CircleConstPI {
    public static void main(String[] args) {
        Circle c01 = new Circle(1.2);
        c01.showPerimeter();
        c01.showArea();
    }
}
