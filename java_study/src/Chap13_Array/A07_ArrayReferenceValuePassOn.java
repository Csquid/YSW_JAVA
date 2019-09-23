package Chap13_Array;

public class A07_ArrayReferenceValuePassOn {
    public static void main(String[] args) {
        int[] ar = new int[]{ 1, 2, 3, 4, 5, 6, 7};

        int sum = sumOfAry(ar);
        System.out.println("sum: " + sum);
    }

    public static int sumOfAry(int[] tempArr) {
        int sum = 0;
        
        for(int i = 0; i < tempArr.length; i++) {
            sum += tempArr[i];
        }

        return sum;
    }
}
