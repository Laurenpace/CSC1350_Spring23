package class_examples.Variables;

import java.util.Scanner;

public class LengthExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String myString = "A sentence maybe.";
        System.out.println(myString.length());

        System.out.println("Enter a string: ");
        String input = in.nextLine();
        System.out.println(input.length());
    }
}
