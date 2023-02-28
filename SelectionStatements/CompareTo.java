package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class CompareTo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("hello".compareTo("harry"));
        System.out.println("a".compareTo("aa"));

        System.out.println("Enter two strings");
        String str1 = in.next();
        String str2 = in.next();
        if(str1.compareTo(str2) < 0){
            System.out.printf("%s alphabetically comes before %s\n", str1, str2);
        }
        else System.out.printf("%s alphabetically comes before %s\n", str2, str1);

        //non case-sensitive option with `compareToIgnoreCase`
        if(str1.compareToIgnoreCase(str2) < 0){
            System.out.printf("%s alphabetically comes before %s", str1, str2);
        }
        else System.out.printf("%s alphabetically comes before %s", str2, str1);
    }
}
