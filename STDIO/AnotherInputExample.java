package class_examples.CSC1350_Spring23.STDIO;

import java.util.Scanner;
/*
input:
Line of text

 */

public class AnotherInputExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myWord = in.next();
        String another = in.next();
//        String another1 = in.next();
//        String another2 = in.next();
//        System.out.println(myWord + another + another1 + another2);
        System.out.println(myWord);
        System.out.println(another);
//        System.out.println(another1);
//        System.out.println(another2);

//        in.nextLine();
//        System.out.print("Enter a sentence: ");
//        String line = in.nextLine();
//        System.out.println(line);
    }
}
