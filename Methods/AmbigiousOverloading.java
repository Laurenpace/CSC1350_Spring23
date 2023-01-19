package class_examples.Methods;


public class AmbigiousOverloading {
    public static void main(String[] args) {
        System.out.println(max(1, 2));
    }


    public static int max(int num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    public static double max(double num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}