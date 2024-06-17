import java.util.Arrays;

public class SegregateZerosOnes {
    public static void segregate(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer until it encounters 1
            while (arr[left] == 0 && left < right) {
                left++;
            }
            // Move right pointer until it encounters 0
            while (arr[right] == 1 && left < right) {
                right--;
            }
            // Swap arr[left] and arr[right]
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0};
        System.out.println("Original array: " + Arrays.toString(arr));
        segregate(arr);
        System.out.println("Segregated array: " + Arrays.toString(arr));
    }
}
