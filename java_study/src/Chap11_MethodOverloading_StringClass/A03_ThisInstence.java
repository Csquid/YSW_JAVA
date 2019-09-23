package Chap11_MethodOverloading_StringClass;

class SimpleBox {
    private int data;

    SimpleBox(int nData) {
        this.data = nData;
    }

    void setData(int nData) {
        this.data = nData;
    }

    int getData() {
        return this.data;
    }
}

public class A03_ThisInstence {
    public static void main(String[] args) {
        SimpleBox box = new SimpleBox(99);
        System.out.println(box.getData());

        box.setData(77);
        System.out.println(box.getData());
    }
}
