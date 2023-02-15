package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class GradeOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double grade = in.nextDouble();
        if(grade > 100){
            System.out.println("Too smart");
        }
        else if(grade >= 90.0) {
            System.out.println("A");
        }
        else if (grade >= 80.0) {
            System.out.println("B");
        }
        else if (grade >= 70.0) {
            System.out.println("C");
        }
        else if (grade >= 60.0) {
            System.out.println("D");
        }
        else System.out.println("Fail");
    }
}
