package class_examples.CSC1350_Spring23.Variables;

public class CharAtExample {
    public static void main(String[] args) {
        String word = "Slothj";
        Character firstChar = word.charAt(0);
        Character lastChar = word.charAt(5);
        System.out.println(firstChar);
        System.out.println(lastChar);
        lastChar = word.charAt(word.length() - 1);
        System.out.println(word.length());
        System.out.println(lastChar);

    }
}
