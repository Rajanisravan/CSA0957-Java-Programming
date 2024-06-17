import java.util.Scanner;

public class ReverseAndSumDigits {

        public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        return reversedNumber;
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        int sumDigits = sumOfDigits(number);

        System.out.println("Reversed Number: " + reversedNumber);
        System.out.println("Sum of Digits: " + sumDigits);
    }
}
