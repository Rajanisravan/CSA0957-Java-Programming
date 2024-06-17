import java.util.*;
public class SumOfArrayElements
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int i,sum=0;
        System.out.println("enter the number:");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        System.out.println("sum of num" +sum);
     }
}