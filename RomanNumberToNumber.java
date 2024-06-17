import java.util.*;

public class RomanNumberToNumber {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int n = s.length();
        int num = romanMap.get(s.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (romanMap.get(s.charAt(i)) >= romanMap.get(s.charAt(i + 1))) {
                num += romanMap.get(s.charAt(i));
            } else {
                num -= romanMap.get(s.charAt(i));
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman number:");
        String str = scanner.nextLine().toUpperCase();

        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'I' || str.charAt(i) == 'X' || str.charAt(i) == 'V' || str.charAt(i) == 'C' || str.charAt(i) == 'D' || str.charAt(i) == 'L' || str.charAt(i) == 'M') {
                flag = 0;
            } else {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(romanToInt(str));
        } else {
            System.out.println("Invalid Input...");
        }
    }
}
