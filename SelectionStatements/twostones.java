package class_examples.CSC1350_Spring23.SelectionStatements;
//kattis problem
import java.util.Scanner;

public class twostones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        5 = alice, 2 = bob
        if(num % 2 == 1){
            System.out.println("Alice");
        }
        else System.out.println("Bob");
    }
}
