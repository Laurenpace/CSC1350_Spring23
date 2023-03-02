package class_examples.CSC1350_Spring23.Loops;

public class PowersTable {
    public static void main(String[] args) {
        //print header
        for (int i = 1; i <= 4; i++){
            System.out.printf("x%-6d", i);
        }
        System.out.printf("\n");

//print each row
        for (int i = 1; i <= 10; i++){
            //print each column in the row
            for(int j = 1; j <=4; j++) {
                System.out.printf("%-7d", (int)Math.pow(i, j));
            }
            System.out.printf("\n");
        }

    }
}
