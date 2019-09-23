package Chap12_Console_Input_Output;

import java.util.Scanner;

public class A03_ScanningString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1;
        String str2;

        System.out.print("Input String: ");
        str1 = sc.nextLine();

        System.out.print("Input String: ");
        str2 = sc.nextLine();

        System.out.println();

        System.out.println("Inputted String1: " + str1);
        System.out.println("Inputted String1: " + str2);
    }
}
