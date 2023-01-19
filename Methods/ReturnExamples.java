package class_examples.Methods;

public class ReturnExamples {
    public static void main(String[] args) {
        System.out.println(returnLiteralString());
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
