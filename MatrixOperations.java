import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Matrix Operations Menu:");
            System.out.println("1. Addition of Matrices");
            System.out.println("2. Subtraction of Matrices");
            System.out.println("3. Multiplication of Matrices");
            System.out.println("4. Transpose of Matrix");
            System.out.println("5. Inverse of Matrix (2x2)");
            System.out.println("6. Sum of Diagonal Elements of Matrix");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performAddition(scanner);
                    break;
                case 2:
                    performSubtraction(scanner);
                    break;
                case 3:
                    performMultiplication(scanner);
                    break;
                case 4:
                    performTranspose(scanner);
                    break;
                case 5:
                    performInverse(scanner);
                    break;
                case 6:
                    performSumOfDiagonals(scanner);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void performAddition(Scanner scanner) {
        System.out.println("Matrix Addition");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter elements of the first matrix:");
        fillMatrix(scanner, matrix1, rows, columns);

        System.out.println("Enter elements of the second matrix:");
        fillMatrix(scanner, matrix2, rows, columns);

        int[][] result = addMatrices(matrix1, matrix2, rows, columns);
        System.out.println("Result of addition:");
        printMatrix(result, rows, columns);
    }

    private static void performSubtraction(Scanner scanner) {
        System.out.println("Matrix Subtraction");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        System.out.println("Enter elements of the first matrix:");
        fillMatrix(scanner, matrix1, rows, columns);

        System.out.println("Enter elements of the second matrix:");
        fillMatrix(scanner, matrix2, rows, columns);

        int[][] result = subtractMatrices(matrix1, matrix2, rows, columns);
        System.out.println("Result of subtraction:");
        printMatrix(result, rows, columns);
    }

    private static void performMultiplication(Scanner scanner) {
        System.out.println("Matrix Multiplication");
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix (and rows for the second matrix): ");
        int columns1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[columns1][columns2];

        System.out.println("Enter elements of the first matrix:");
        fillMatrix(scanner, matrix1, rows1, columns1);

        System.out.println("Enter elements of the second matrix:");
        fillMatrix(scanner, matrix2, columns1, columns2);

        int[][] result = multiplyMatrices(matrix1, matrix2, rows1, columns1, columns2);
        System.out.println("Result of multiplication:");
        printMatrix(result, rows1, columns2);
    }

    private static void performTranspose(Scanner scanner) {
        System.out.println("Transpose of Matrix");
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter elements of the matrix:");
        fillMatrix(scanner, matrix, rows, columns);

        int[][] result = transposeMatrix(matrix, rows, columns);
        System.out.println("Transpose of the matrix:");
        printMatrix(result, columns, rows);
    }

    private static void performInverse(Scanner scanner) {
        System.out.println("Inverse of 2x2 Matrix");
        System.out.println("Enter elements of the 2x2 matrix:");
        double[][] matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double[][] result = inverseMatrix(matrix);
        if (result != null) {
            System.out.println("Inverse of the matrix:");
            printMatrix(result);
        } else {
            System.out.println("Inverse does not exist for the given matrix.");
        }
    }

    private static void performSumOfDiagonals(Scanner scanner) {
        System.out.println("Sum of Diagonal Elements of Matrix");
        System.out.print("Enter the number of rows and columns (square matrix): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        fillMatrix(scanner, matrix, n, n);

        int sum = sumOfDiagonalElements(matrix, n);
        System.out.println("Sum of diagonal elements: " + sum);
    }

    private static void fillMatrix(Scanner scanner, int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows1, int columns1, int columns2) {
        int[][] result = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < columns1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix, int rows, int columns) {
        int[][] result = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    private static double[][] inverseMatrix(double[][] matrix) {
        double determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        if (determinant == 0) {
            return null;
        }
        double[][] inverse = {
            { matrix[1][1] / determinant, -matrix[0][1] / determinant },
            { -matrix[1][0] / determinant, matrix[0][0] / determinant }
        };
        return inverse;
    }

    private static int sumOfDiagonalElements(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f ", value);
            }
            System.out.println();
        }
    }
}
