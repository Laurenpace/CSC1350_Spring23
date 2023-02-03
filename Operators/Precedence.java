package class_examples.CSC1350_Spring23.Operators;

public class Precedence {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println("Precedence summing num1 and num2 " + num1 + num2);
        //JVM is implicitly casting the integers to strings and concatenating them
        //+ had left to right precedence to it sees a string first and converts num1
        //to a string

        System.out.println("Add parenthesis to sum num1 and num2 and not concat them "
                + (num1 + num2));

        int a = 3;
        int b = 4;
        //precedence lets us sum since there is an integer first
        System.out.println(a + b +" ");
        //below if we see encounter a string the ints are converted to strings and concatenated
        System.out.println(a + b +" "+ a+b);
        System.out.println(""+ a+b); //also concatenated because there is a string first

    }

}
