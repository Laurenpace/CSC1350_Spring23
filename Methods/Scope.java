package class_examples.CSC1350_Spring23.Methods;

public class Scope {
    static int num = 5;
        public static int square(int n) {

            int result = n * n;
            return result;

        }
        public static void main(String[] args){
            System.out.println(num); //global num
            int num = 2;
            System.out.println(num);
            int result = square(3) + square(4);
            System.out.println(result);
        }

    }

