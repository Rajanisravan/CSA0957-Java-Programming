import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Tax to be paid: " + tax);
        
        scanner.close();
    }

    public static double calculateTax(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return (income - 250000) * 0.1;
        } else if (income <= 1000000) {
            return 25000 + (income - 500000) * 0.2;
        } else {
            return 125000 + (income - 1000000) * 0.3;
        }
    }
}
