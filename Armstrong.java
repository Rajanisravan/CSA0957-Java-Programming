import java.util.*;
public class Armstrong
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        int n=sc.nextInt(),sum=0,rem,t;
        t=n;
        while(t!=0)
        {
            rem=t%10;
            sum=sum+(rem*rem*rem);
            t=t/10;
        }
    if(sum==n)
    {
        System.out.println("Armstrong");
    }
    else
    {
        System.out.println("not armstrong");
    }
  }
}