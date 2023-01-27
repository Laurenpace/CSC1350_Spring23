package class_examples.CSC1350_Spring23.Operators;

public class Operators {
    public static void main(String[] args) {
        System.out.println("4 == 4 is " + (4 == 4));
        System.out.println("4 == 5 is " + (4 == 5));
        System.out.println("4 != 5 is " + (4 != 5));
        System.out.println("4 != 4 is " + (4 != 4));
        System.out.println("4 < 4 is " + (4 < 4));
        System.out.println("4 < 5 is " + (4 < 5));
        System.out.println("4 <= 4 is " + (4 <= 4));
        System.out.println("4 <= 5 is " + (4 <= 5));
        System.out.println("4 > 4 is " + (4 > 4));
        System.out.println("4 > 5 is " + (4 > 5));
        System.out.println("4 > 5 is " + (4 > 5));
        int num1 = 10;
        int num2 = 5;

        //Addition
        int sum = num1 + num2;
        System.out.println("num1 + num2 = " + sum);
        //Subtraction
        int difference = num1 - num2;
        System.out.println(difference);
        //Multiplication
        int product = num1 * num2;
        System.out.println(product);
        //Division
        int quotient = num1/num2;
        System.out.println(quotient);

        //The division above works really well because 10 divides by 5 evenly
        //If we had two integers that didn't divide evenly we would have an inaccurate value
        //This is called integer division
        //When dividing integer there is no remainder

        num1 = 10;
        num2 = 3;
        quotient = num1/num2;
        System.out.println(quotient);
        //the quotient above prints 3.
        //this is because we divide 3 into 10 3 times and the remainder (1) gets cut
        //this is because the integer can not store that decimal remainder

        double doubleNum1 = 10;
        double doubleNum2 = 3;
        double doubleQuotient = doubleNum1/doubleNum2;
        System.out.println(doubleQuotient);
        //now our remainder is saved because we have the datatype that can store it

        //the modulus operator can be very useful in programming
        //often it is used to know if a number is odd or even

        System.out.println(num1%2);
        System.out.println(num2%2);

    }
}
