import java.util.*;
public class Fibonacci
{
    public static void main(String []args)
    {
        int n,a=0,b=0,c=1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        n=sc.nextInt();
        System.out.println("fibonacci series is ");
        for(i=0;i<=n;i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.println(a+" ");
        }
     }
}
