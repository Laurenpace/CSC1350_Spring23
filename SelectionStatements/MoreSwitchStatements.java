package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class MoreSwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        switch (str){
            case "Goodbye":
                System.out.println("you entered \"Goodbye\""); break;
            case "Hello":
                System.out.println("you entered \"Hello\""); break;
            default:
                System.out.println("default: input doesn't match");
        }
    }
}

