package class_examples.CSC1350_Spring23.Operators;

public class MixedDatatypes {
    public static void main(String[] args) {
        int x = 5;
        double y = 6.0;
        //error due to precedence, casting has precedence over division
        //x + y is converted to an int and then divided by a double making the result a double
//        int average = (int)(x+y) /2.0;

        //type mismatch
//        int average = (x + y) / 2.0;
        int average = (int)(x+y /2.0);

        double doubleAverage = (x + y) / 2.0;
    }
}
