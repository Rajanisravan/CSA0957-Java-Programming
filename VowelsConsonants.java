import java.util.Scanner;

public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                vowels += ch;
            } else if (Character.isLetter(ch)) {
                consonants += ch;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
