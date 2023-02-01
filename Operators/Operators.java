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
        System.out.println("10 + 5 = " + sum);
        //Subtraction
        int difference = num1 - num2;
        System.out.println("10 - 5 = " + difference);
        //Multiplication
        int product = num1 * num2;
        System.out.println("10 * 5 = " + product);
        //Division
        int quotient = num1/num2;
        System.out.println("10 / 5 = " + quotient);

        //The division above works really well because 10 divides by 5 evenly
        //If we had two integers that didn't divide evenly we would have an inaccurate value
        //This is called integer division
        //When dividing integer there is no remainder
        //Division

        num1 = 10;
        num2 = 3;
        quotient = num1/num2;
        System.out.println("integer 10/3 = " + quotient);
        //the quotient above prints 3.
        //this is because we divide 3 into 10 3 times and the remainder (1) gets cut
        //this is because the integer can not store that decimal remainder

        double doubleNum1 = 10;
        double doubleNum2 = 3;
        double doubleQuotient = doubleNum1/doubleNum2;
        System.out.println("double 10/3 = " + doubleQuotient);
        //now our remainder is saved because we have the datatype that can store it

        //the modulus operator can be very useful in programming
        //often it is used to know if a number is odd or even
        System.out.println("\nModulus examples");
        int remainder = num1%num2;
        System.out.println("integer 10%3 = " + remainder);



        System.out.println("10%2 = " + num1%2);
        System.out.println("5%2 = " + num2%2);

        System.out.println("\nIncrement and decrement");
        int count = 0;
        int num = count++; //value of count returned (assigned) then incremented
        System.out.println("num assigned to 0++: " + num);
        System.out.println("result of 0++: " + count);

        count = 0;
        num = ++count; //value of count incremented then returned
        System.out.println("num assigned to ++0: " + num);
        System.out.println("result of ++0: " + count);
    }
}
