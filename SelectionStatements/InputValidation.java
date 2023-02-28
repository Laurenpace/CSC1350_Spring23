package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100");
        if (in.hasNextInt()){
            int num = in.nextInt();
            System.out.println("You entered an integer");
            if(num >= 1 && num <= 100){
                System.out.println("You enter a number between 1 and 100");
            }
            else {
                System.out.println("You entered a number outside 1 and 100");
            }
        }
        else if (in.hasNextDouble()){
            System.out.println("You entered a double");
        }
        else System.out.println("Did not enter an integer or double"); //program ends


    }
}
