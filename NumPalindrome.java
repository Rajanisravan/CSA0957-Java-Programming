import java.util.*;
public class NumPalindrome
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n,num,rem,rev=0;
        System.out.println("enter the number:");
        n=sc.nextInt();
        num=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(num==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}