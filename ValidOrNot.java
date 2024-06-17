import java.util.Scanner;
public class ValidOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
 System.out.println("Enter the two names :");
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        if (s1.equals(s2)) {
            System.out.println("User name is valid");
        } else {
            System.out.println("User name is Invalid");
        }
    }
        }