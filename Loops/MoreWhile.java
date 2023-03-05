package class_examples.CSC1350_Spring23.Loops;

import java.util.Scanner;

public class MoreWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //print odd numbers up until input number
        //enter 20
        //print: 1, 3, 5, 7, 9...
        int n = in.nextInt();
        System.out.println("Odd numbers");
        int count = 1;
        while(count < n){
            if(count % 2 != 0){
                System.out.print(count + " ");
            }
            count++;
        }

        //print numbers divisible by 3 up to input
        //output: 1 2 4 6 8 ...
        count = 1;
        System.out.println("\nDivisible by 3");
        while(count < n){
            if(count % 3 == 0){
                System.out.print(count + " ");
            }
            count++;
        }

        System.out.println("\nDivisible by 5");
        //given n print numbers that are less than n and are divisible by 5
        //input: 25
        //output: 5 10 15 20
        count = 5;
        while(count < n){
            System.out.print(count + " ");
            count += 5;
        }

        //
        System.out.println("\nEnter positive numbers to sum (enter 0 to exit)");
        int num = in.nextInt();
        int sum = num;
        while(num != 0){
            num = in.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}
