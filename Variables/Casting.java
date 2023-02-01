package class_examples.CSC1350_Spring23.Variables;

public class Casting {
    public static void main(String[] args) {


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
        System.out.println("int to double" + castedDoubleToInt);
        //casting characters to integers
        char char_a = 'a';
        int char_a_toInt = 'a';

        System.out.println(char_a);
        System.out.println(char_a_toInt);
        System.out.println((char)char_a_toInt);
        System.out.println((char)(97));
    }
}
