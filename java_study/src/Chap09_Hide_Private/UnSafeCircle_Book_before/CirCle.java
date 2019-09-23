package Chap09_Hide_Private.UnSafeCircle_Book_before;

public class CirCle {
    double rad = 0;
    final double PI = 3.14;

    public CirCle(double r) {
        setRad(r);
    }

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
        }

        rad = r;
    }

    public double getArea() {
        //return Circle Area
        return (rad * rad) * PI;
    }
}
