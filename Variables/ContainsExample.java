package class_examples.CSC1350_Spring23.Variables;

public class ContainsExample {
    public static void main(String[] args) {
        String testString = "This is a string with words?";
        String wordsString = "words";
        System.out.println(testString.contains(wordsString)); //checking variable wordsString
        System.out.println(testString.contains("words")); //can also use a string literal
        System.out.println(testString.contains("word")); //can check if part of a word is in a string
        System.out.println(testString.contains("Words")); //contains is case sensitive
        System.out.println(testString.contains("?")); //contains is case sensitive
        System.out.println(testString.toUpperCase());
    }
}
