package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class NumberLineExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num >= 5 && num <= 10) System.out.println("5 <= num <= 10");
        if(num > 5 && num < 10) System.out.println("5 < num < 10");
        if(num <= 5 || num >= 10) System.out.println("n");
    }
}
