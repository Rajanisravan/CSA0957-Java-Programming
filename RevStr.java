import java.util.*;
public class RevStr
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String a=sc.next();
        StringBuilder b=new StringBuilder(a).reverse();
        System.out.println("the reversed string is:" +b);
    }
}