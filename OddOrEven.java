import java.util.*;
public class OddOrEven
{
    public static void main(String []args)
        {
             Scanner sc=new Scanner(System.in);
             int a;
             System.out.println("enter the a value");
             a=sc.nextInt();
             if(a%2==0)
                 System.out.println("even"+a);
             else
                 System.out.println("odd"+a);
         }
}