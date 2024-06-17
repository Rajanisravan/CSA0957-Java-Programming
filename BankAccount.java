import java.util.Scanner;

public class BankAccount {`
    // Data members
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    // Constructor
    public BankAccount(String depositorName, int accountNumber, String accountType, double balance)  {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to read account details
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        this.accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter depositor name: ");
        this.depositorName = scanner.nextLine();
        System.out.print("Enter type of account: ");
        this.accountType = scanner.nextLine();
        System.out.println("Account details saved successfully.");
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Current balance: Rs " + balance);
    }

    // Getter methods
    public String getDepositorName() {
        return depositorName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("", 0, "", 0);
        account.readAccountDetails();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        account.displayBalance();

        scanner.close();
    }
}