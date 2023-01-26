package class_examples.STDIO;


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        //clean input
//        in.nextLine();
        System.out.println("You entered: " + word);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        System.out.println("You entered: " + sentence);
    }
}
