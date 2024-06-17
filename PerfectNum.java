import java.util.*;
public class PerfectNum
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("enter the number");
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            sum+=i;
        }
         if(sum==n)
         {
             System.out.println("perfect number");
         }
         else{
             System.out.println("not perfect number");
         }
     }
}