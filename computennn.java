import java.util.Scanner;

public class computennn {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer N: ");
        int N = scanner.nextInt();

        
        int NN = N * N;
        int NNN = N * N * N; 

        
        int result = N + NN + NNN;

       
        System.out.println("The value of N + N*N + N*N*N is: " + result);

        
        scanner.close();
    }
}
