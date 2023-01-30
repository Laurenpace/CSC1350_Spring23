package class_examples.CSC1350_Spring23.Arrays;

public class DoubleArrayExample {
    public static void main(String[] args) {

        double[] arrayOfDoubles = {4.0, 3.2, 4.5};
        double firstElement = arrayOfDoubles[0];

        System.out.println("Access first element of array:");
        System.out.println(firstElement);
        System.out.println(arrayOfDoubles[0]);

        System.out.println("Size of array:");
        System.out.println(arrayOfDoubles.length);

        System.out.println("Access last element of array:");
        //access last element of array
        System.out.println(arrayOfDoubles[2]);
        System.out.println(arrayOfDoubles[arrayOfDoubles.length - 1]);

        System.out.println("Error when calling length of array without subtracting one:");
        //throws array index out of bound exception
        System.out.println(arrayOfDoubles[arrayOfDoubles.length]);

    }
}
