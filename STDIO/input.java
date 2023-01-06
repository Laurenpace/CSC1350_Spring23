package class_examples.STDIO;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Boolean bool = in.nextBoolean();
        if (bool)
            System.out.println(bool + "True");
        else System.out.println(bool + "False");
//        in.next
    }
}
