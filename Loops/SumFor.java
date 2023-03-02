package class_examples.CSC1350_Spring23.Loops;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0; //declare out here so we can print it after loop
//        int i = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
//        System.out.println(number);
        System.out.println(n);
    }
}
