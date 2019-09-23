package Chap13_Array;

import java.util.Arrays;

public class A03_ArrayReferenceTet {
    public static void main(String[] args) {
        int[] arr1 = new int[]{ 1, 2, 3, 4, 5 };
        int[] arr2 = arr1;

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));

        System.out.println("arr1 address: " + arr1);
        System.out.println("arr2 address: " + arr2);

        arr1[2] = 0;

        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
