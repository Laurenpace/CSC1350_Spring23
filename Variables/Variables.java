package class_examples.Variables;

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


        short num = 555;
        //implicit casting
        int castedShortToInt = num;
        System.out.println(castedShortToInt);

        int integerToCast = 4;
        System.out.println(integerToCast);

        //redundant cast
//        double castedIntToDouble = (double)integerToCast;
        //implicit casting works here
        double castedIntToDouble = integerToCast;
        System.out.println(castedIntToDouble);

        double doubleToCast = 4.9999999999999;

        //explicit casting lossy conversion
        int castedDoubleToInt = (int) doubleToCast;

        //casting characters to integers
        char char_a = 'a';
        int char_a_toInt = char_a;

        System.out.println(char_a);
        System.out.println(char_a_toInt);
        System.out.println((char)char_a_toInt);
        System.out.println((char)(97));

    }
}
