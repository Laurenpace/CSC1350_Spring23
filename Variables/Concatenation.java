package class_examples.CSC1350_Spring23.Variables;

public class Concatenation {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("num = " + num);
        String someString1 = "hi";
        String someString2 = "string";
        String stringConcat = someString1 + someString2;
        System.out.println("result of concatenating and printing " + stringConcat);
        System.out.println("someString1 is unchanged: " + someString1);
        System.out.println("someString2 is unchanged: " + someString2);
        System.out.println("concat in print statement " + someString1 + someString2);
        System.out.println("formating strings cleanly with spacing: " + someString1 + " " + someString2);
    }
}
