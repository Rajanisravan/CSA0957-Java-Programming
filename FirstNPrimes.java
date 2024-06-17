import java.util.Scanner;

public class FirstNPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();

        printFirstNPrimes(n);
    }

    public static void printFirstNPrimes(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int count = 0; 
        int number = 2; 
        while (count < n) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true; 
        if (num % 2 == 0) return false; 
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
