package class_examples.CSC1350_Spring23.Loops;

public class CountingUpperCaseLetters {
    public static void main(String[] args) {
        int upperCaseLetters = 0;
        String str = "Hello, my name is Mike the Tiger.";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCaseLetters++;
            }
        }
        System.out.printf("\"%s\" has %d uppercase characters\n", str, upperCaseLetters);

    }
}
