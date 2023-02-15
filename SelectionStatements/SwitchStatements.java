package class_examples.CSC1350_Spring23.SelectionStatements;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 5");
//        int num = in.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("You entered 1");
//                break;
//            case 2:
//                System.out.println("You entered 2");
//                break;
//            case 3:
//                System.out.println("You entered 3");
//                break;
//            case 4:
//                System.out.println("You entered 4");
//                break;
//            case 5:
//                System.out.println("You entered 5");
//                break;
//            default:
//                System.out.println("You entered a number outside the range");
//        }
//
////        int num = in.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("You entered 1");
//                break;
//            case 2:
//                System.out.println("You entered 2");
//                break;
//            case 3:
//                System.out.println("You entered 3");
//                break;
//            case 4:
//                System.out.println("You entered 4");
//                break;
//            case 5:
//                System.out.println("You entered 5");
//                break;
//            default:
//                System.out.println("You entered a number outside the range");
//        }

        System.out.println("Enter an integer: ");
        int digit = in.nextInt();
        String digitName;
        switch (digit){
            case 1: digitName = "one";   break;
            case 2: digitName = "two";   break;
            case 3: digitName = "three"; break;
            case 4: digitName = "four";  break;
            case 5: digitName = "five";  break;
            case 6: digitName = "six";   break;
            case 7: digitName = "seven"; break;
            case 8: digitName = "eight"; break;
            case 9: digitName = "nine";  break;
            default: digitName = "";      ;
        }
        System.out.println(digitName);

    }
}
