import java.util.Scanner;

public class TextOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        while (true) {
            System.out.println("\nText Operations Menu:");
            System.out.println("a. Length of the given text");
            System.out.println("b. Find the subset of the given text");
            System.out.println("c. Count vowels and consonants of the given text");
            System.out.println("d. Count number of words and sentences in the given text");
            System.out.println("e. Check the given text is palindrome or not");
            System.out.println("f. Convert the given text into uppercase and vice versa");
            System.out.println("g. Exit");
            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    System.out.println("Length of the given text: " + text.length());
                    break;
                case 'b':
                    System.out.print("Enter start index: ");
                    int startIndex = scanner.nextInt();
                    System.out.print("Enter end index: ");
                    int endIndex = scanner.nextInt();
                    System.out.println("Subset of the text: " + getTextSubset(text, startIndex, endIndex));
                    break;
                case 'c':
                    countVowelsAndConsonants(text);
                    break;
                case 'd':
                    countWordsAndSentences(text);
                    break;
                case 'e':
                    System.out.println("The text is " + (isPalindrome(text) ? "a palindrome." : "not a palindrome."));
                    break;
                case 'f':
                    System.out.println("Uppercase: " + text.toUpperCase());
                    System.out.println("Lowercase: " + text.toLowerCase());
                    break;
                case 'g':
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static String getTextSubset(String text, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {
            return "Invalid indices";
        }
        return text.substring(startIndex, endIndex);
    }

    public static void countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        text = text.toLowerCase();
        for (char c : text.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }

    public static void countWordsAndSentences(String text) {
        String[] words = text.split("\\s+");
        String[] sentences = text.split("[!?.:]+");
        System.out.println("Number of words: " + words.length);
        System.out.println("Number of sentences: " + sentences.length);
    }

    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        int length = cleanText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanText.charAt(i) != cleanText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
