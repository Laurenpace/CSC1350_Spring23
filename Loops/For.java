package class_examples.CSC1350_Spring23.Loops;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
        int i = 0;
        for(; i < 5;){
            System.out.println("Hello world!");
            i++;
        }
        for (int j = 0; j <= 10; j = j + 2) {
            System.out.println(j);

        }
        for (int k = 10; k > 0; k--){
            System.out.print(k + "...");
        }

    }
}
