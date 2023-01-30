package class_examples.CSC1350_Spring23.Methods;

public class MultiplyMethod {
    public static void main(String[] args) {
        //calling method with literals
        double firstOutput = multiplyTwoNums(4, 5.0);

        int myNum1 = 4;
        double myNum2 = 5.0;

        //calling method with variables
        double secondOutput = multiplyTwoNums(myNum1, myNum2);

        System.out.println(firstOutput);
        System.out.println(secondOutput);
    }

    public static double multiplyTwoNums(double num1, double num2){
        return num1 * num2;
    }
}
