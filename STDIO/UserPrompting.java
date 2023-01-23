package class_examples.STDIO;

import java.util.Scanner;

public class UserPrompting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        it's important to give your user a descriptive prompt so your
        they don't enter something that will cause an error

        Say you want to have the user enter two words, to make this simple you
        may ask that the user gives each word on an individual line
        * */

        System.out.println("Enter your name and age on two separate lines");
        String name = in.nextLine();
        int age = in.nextInt();
        //when taking integer input and hitting enter
        // there's a hidden new line that hasn't been read yet
        in.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        //this words but it's unnecessarily confusing to a user
        //to make things clearer it's best to ask the user for individual inputs

        //use print not println to make input appear on the same line
        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.print("Enter your age: ");
        age = in.nextInt();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        /*
        There should never be any confusion as to what the user should enter
        or how they should enter it
         */

    }
}
