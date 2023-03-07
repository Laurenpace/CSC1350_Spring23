package class_examples.CSC1350_Spring23.Methods;

public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
        System.out.println(max(1, 2.0));
        System.out.println(max(2.0, 1));
        System.out.println(max(1.0, 2.0));
        System.out.println(max(3, 2.5, 1.0));
    }

    //max with that takes two doubles
    public static double max(double num1, double num2) {
        System.out.println("Two double parameter method called");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(int num1, double num2) {
        System.out.println("int and double parameter method called");

        if (num1 > num2)
            return num1;
        else
            return num2;
    }
//    public static double max(double num1, int num2) {
//        System.out.println("double and int parameter method called");
//        if (num1 > num2)
//            return num1;
//        else
//            return num2;
//    }

    //max method to take two integers
    public static int max(int num1, int num2) {
        System.out.println("Two integer parameter method called");
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, double num2, double num3) {
        System.out.println("three double parameter method called");

        return max(max(num1, num2), num3);
    }
}
