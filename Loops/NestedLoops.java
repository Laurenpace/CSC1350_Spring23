package class_examples.CSC1350_Spring23.Loops;

public class NestedLoops {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = i+1; j <= n; j++)
            {
                for (int k = i+j-1; k <= n; k++)
                {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
