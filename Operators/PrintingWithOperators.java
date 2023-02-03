package class_examples.CSC1350_Spring23.Operators;

public class PrintingWithOperators {
    public static void main(String[] args) {
        System.out.println("We can perform computations in print statements.");
        double num1 = 4.355;
        double num2 = 5.0;
        System.out.println("Printf makes printing math statements very easy");
        System.out.printf("summing num1 and num2 =  %.2f\n", num1 + num2);
        System.out.println("We can also do computations in println. num1 + num2 = " + (num1 + num2));
    }
}
