package Chap10_ClassVariable_ClassMethod;

import java.time.LocalDate;

class DataOfExecution {
    static String date;

    static {
        LocalDate nDate = LocalDate.now();
        date = nDate.toString();
    }
}

public class A08_DataOfExecution {
    public static void main(String[] args) {
        System.out.println(DataOfExecution.date);
        System.out.println(Math.PI);
    }
}
