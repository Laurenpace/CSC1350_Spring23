package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String secret = "pa55w0rd";
        String inputPassword = in.nextLine();
        boolean validUser = false;
        if (secret.equals(inputPassword)) {
            System.out.println("You entered the secret password");
            validUser = true;
        }
        else System.out.println("You are not a valid user, you should quit the program");

        if(validUser){
            System.out.println("You have access to the program");
            //could implement a program here now
        }
        else System.out.println("Again not a valid user");
    }
}
