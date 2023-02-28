package class_examples.CSC1350_Spring23.Loops;

import java.util.Scanner;

public class MoreInputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a password (limit 5 characters): ");
        String password = in.nextLine();
        while(password.length() > 5 ){
            System.out.println("Password too long, please enter another password");
            password = in.nextLine();
        }
        System.out.println("Correct password length");
    }
}
