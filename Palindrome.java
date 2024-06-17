import java.util.*;
public class Palindrome{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String a=sc.next();
        StringBuilder b=new StringBuilder(a).reverse();
        System.out.println("rev string is:" +b);
        if(a.equals(b.toString())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}