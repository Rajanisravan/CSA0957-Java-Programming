import java.util.Scanner;

class Employee {
    private String employeeCode;
    private String employeeName;
    private String departmentName;
    private double basicPay;
    private boolean isUrban;
    private double da;
    private double hra;
    private double deductions;
    private double netPay;
    private double grossPay;

    public Employee(String employeeCode, String employeeName, String departmentName, double basicPay, boolean isUrban) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.departmentName = departmentName;
        this.basicPay = basicPay;
        this.isUrban = isUrban;
        calculateDA();
        calculateHRA();
        calculateDeductions();
        calculatePay();
    }

    private void calculateDA() {
        this.da = 0.10 * basicPay;
    }

    private void calculateHRA() {
        if (isUrban) {
            this.hra = 0.10 * basicPay;
        } else {
            this.hra = 0.05 * basicPay;
        }
    }

    private void calculateDeductions() {
        double festivalAdvanceDeduction = 1000; // Per month
        double housingLoanDeduction = 20000 / (15 * 12); // Monthly installment for 15 years
        this.deductions = festivalAdvanceDeduction + housingLoanDeduction;
    }

    private void calculatePay() {
        this.grossPay = basicPay + da + hra;
        this.netPay = grossPay - deductions;
    }

    public void printPaySlip() {
        System.out.println("---------------------------------------------------");
        System.out.println("Pay Slip");
        System.out.println("---------------------------------------------------");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Code: " + employeeCode);
        System.out.println("Department Name: " + departmentName);
        System.out.println("---------------------------------------------------");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Deductions: " + deductions);
        System.out.println("Net Pay: " + netPay);
        System.out.println("---------------------------------------------------");
    }
}

public class PaySlipGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee code: ");
        String employeeCode = scanner.nextLine();

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter department name: ");
        String departmentName = scanner.nextLine();

        System.out.print("Enter basic pay: ");
        double basicPay = scanner.nextDouble();

        System.out.print("Is the employee working in an urban area? (true/false): ");
        boolean isUrban = scanner.nextBoolean();

        Employee employee = new Employee(employeeCode, employeeName, departmentName, basicPay, isUrban);
        employee.printPaySlip();

        scanner.close();
    }
}
