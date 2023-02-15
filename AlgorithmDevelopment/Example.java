package class_examples.CSC1350_Spring23.AlgorithmDevelopment;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        //given four numbers, sum them, and print the result
        //define the input, should know
        Scanner in = new Scanner(System.in);
        int sum = in.nextInt();
        sum += in.nextInt();
        sum += in.nextInt();
        sum += in.nextInt();
        System.out.println(sum);
    }
}
