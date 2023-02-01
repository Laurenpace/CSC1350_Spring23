package class_examples.CSC1350_Spring23.Variables;

import java.util.Scanner;

public class stringExample {
    public static void main(String[] args) {
        String whatever = "asdf asdf asdf 5 re fdf !2@#$%^&*";
        Scanner in = new Scanner(System.in);
        String input = "";
        input = in.nextLine();
        System.out.println(input);
        input = "asdf 3 4 56 6 reassigning input string";
        System.out.println(input);
        System.out.println(whatever);
        String num = "5";
        System.out.println(num);
    }
}
