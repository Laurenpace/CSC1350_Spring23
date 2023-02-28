package class_examples.CSC1350_Spring23.Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Enter a number less than 10");
            value = in.nextInt();

        }
        while(value < 10);
        System.out.println("Exited");
    }
}
