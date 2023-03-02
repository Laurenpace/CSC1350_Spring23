package class_examples.CSC1350_Spring23.Loops;

public class NestedLoopAsterick {
    public static void main(String[] args) {
        int i;
        int j;
        for(i = 1; i <= 5; i++){
            for(j = 0; j < i; j++) {
                System.out.printf("%-10s", "*");
            }
            System.out.printf("\n");
        }
    }
}
