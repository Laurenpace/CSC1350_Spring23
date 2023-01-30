package class_examples.CSC1350_Spring23.Variables;

public class SubstringExample {
    public static void main(String[] args) {
        String str = "Hi everyone";
        String hi = str.substring(0, 3); //.substring(inclusive, exclusive)
        System.out.println(str);
        System.out.println(hi);
    }
}
