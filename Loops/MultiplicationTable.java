package class_examples.CSC1350_Spring23.Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10 ; j++) {
                System.out.printf("%-4d" , i*j );
            }
            System.out.println();
        }
    }
}
