package class_examples.CSC1350_Spring23.Variables;

public class Variables {
    public static void main(String[] args) {

        int maxInt = Integer.MAX_VALUE;
        double numDouble = 5.0;
        double maxDouble = Double.MAX_VALUE;
        long numLong = 455555555L;
        long maxLong = Long.MAX_VALUE;
        short numShort = 5;
        short maxShort = Short.MAX_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("Max integer: " + maxInt);
        System.out.println(numDouble);
        System.out.println("Max double: " + maxDouble);
        System.out.println(numLong);
        System.out.println("Max long: " + maxLong);
        System.out.println(numShort);
        System.out.println("Max short: " + maxShort);
        System.out.println("Max float: " + maxFloat);
        System.out.println("Max byte: " + Byte.MAX_VALUE);

        //variable declaration
        int numInt;
        //error thrown here cause variable has not been initialized
//        System.out.println("numInt: " + numInt);

        //variable initialization
        numInt = 5;
        System.out.println("numInt: " + numInt);

        //you can reassign variables
        numInt = 10;
        System.out.println("numInt: " + numInt);


    }
}
