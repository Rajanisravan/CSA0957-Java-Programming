import java.util.Scanner;
class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, k, n;
        System.out.println("Enter the number of elements:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    j--;
                    n--;
                }
            }
        }
        System.out.println("Array after removing duplicates:");
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
