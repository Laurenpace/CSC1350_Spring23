package class_examples.CSC1350_Spring23.Methods;

public class VoidMethod {
    public static void main(String[] args) {
        //calling method with literals
        multiplyTwoNumsAndPrint(4, 5.0);

        int myNum1 = 4;
        double myNum2 = 5.0;

        //calling method with variables
        multiplyTwoNumsAndPrint(myNum1, myNum2);
        printHello();
    }

    public static void multiplyTwoNumsAndPrint(double num1, double num2){
        System.out.println(num1 * num2);
    }
    public static void printHello(){
        System.out.println("Hello");
    }
}
