package class_examples.CSC1350_Spring23.Variables;

public class printfExample {
    public static void main(String[] args) {
        final double PI = 3.1415926;
        System.out.printf("PI with two decimal points is $%.2f\n", PI);

        int price = 50;
        double tax = 0.05;
        System.out.printf("price: %d, tax: %.2f\n", price, tax);

        String items = "Claims";
        double price2 = 17.29;
        System.out.printf("%-10s%10.2f", items + ":", price2);



    }
}