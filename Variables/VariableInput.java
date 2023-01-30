package class_examples.CSC1350_Spring23.Variables;

import java.util.Scanner;

public class VariableInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int inputInt = in.nextInt();
        System.out.println(inputInt);
//
        inputInt = in.nextInt();
        System.out.println(inputInt);
        double inputDouble = in.nextDouble();
        System.out.println(inputDouble);

        short variablewhatever = in.nextShort();
        System.out.println(variablewhatever);


        boolean bool = true;
        System.out.println(bool);
    }
}

