package class_examples.CSC1350_Spring23.Loops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int count = 0;
        while (in.hasNextDouble()){
            double input = in.nextDouble();
            total = total + input;
            count++;
        }
        double average = 0;
        if (count > 0) {
            average = total / count;
        }
        System.out.println("Average: " + average);
    }
}
