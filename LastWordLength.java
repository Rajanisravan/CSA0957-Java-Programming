import java.util.Scanner;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int lengthOfLastWord = getLastWordLength(input);
        System.out.println("Length of the last word: " + lengthOfLastWord);
    }

    public static int getLastWordLength(String s) {
        int length = 0;
        int end = s.length() - 1;

        // Traverse the string from the end to find the first non-space character
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }

        // Count the length of the last word
        while (end >= 0 && s.charAt(end) != ' ') {
            length++;
            end--;
        }

        return length;
    }
}
