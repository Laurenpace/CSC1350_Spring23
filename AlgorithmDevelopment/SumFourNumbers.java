package class_examples.CSC1350_Spring23.AlgorithmDevelopment;

import java.util.Scanner;

public class SumFourNumbers {
    public static void main(String[] args) {
        //need to take input
        Scanner in = new Scanner(System.in);

//        //Define four double variables for input
        double num1, num2, num3, num4;
////        Define a double variable for sum
//        double sum;
//
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        num3 = in.nextDouble();
        num4 = in.nextDouble();

        System.out.printf("Sum is %.5f\n", (num1 + num2 + num3 + num4));
        System.out.println("Sum is " + (num1 + num2 + num3 + num4));
        System.out.println("num1 is " + num1 + ", num2 is " + num2);
        System.out.printf("num1 is %.1f, num2 is %.1f", num1, num2);
//        //        Add the input variables and assign the value to sum
//        sum = num1 + num2 +  num3 + num4;
//
//        //print sum
//        System.out.println(sum);
//
//        System.out.println(in.nextDouble() + in.nextDouble() + in.nextDouble() + in.nextDouble());
//        System.out.println("You entered " + in.nextLine());

    }
}
