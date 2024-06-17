public class SumOfDigits {
    public static void main(String[] args) {
        int number = 9875; 
        int singleDigitSum = getSingleDigitSum(number);
        System.out.println("The single digit sum is: " + singleDigitSum);
    }

    public static int getSingleDigitSum(int num) {
        while (num >= 10) {
            num = sumDigits(num);
        }
        return num;
    }

    private static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
