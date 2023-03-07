package class_examples.CSC1350_Spring23.Methods;

public class ReturnExamples {
    public static void main(String[] args) {
        System.out.println(returnLiteralString());
        System.out.println(returnAddedIntegersGood(4, 5));
        System.out.println(returnAddedIntegersUgly(4, 5));
    }

//    returning a literal
    public static String returnLiteralString(){
        return "hi";
    }

//    returning a variable, this code works but is unnecessarily long
    public static int returnAddedIntegersUgly(int num1, int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }

//    better implementaion of above method.
    public static int returnAddedIntegersGood(int num1, int num2){
        return num1 + num2; //since there is no need to use the value of sum in this method we can just return the sum without creating it as a new variable
    }


}
