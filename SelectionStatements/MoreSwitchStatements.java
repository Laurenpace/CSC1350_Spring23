package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class MoreSwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        switch (str){
            case "a":
                System.out.println("you entered a"); break;
            case "b":
                System.out.println("you entered b"); break;
            default:
                System.out.println("default: input doesn't match");
        }
    }
}

