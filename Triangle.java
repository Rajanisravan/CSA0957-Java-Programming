import java.util.*;
public class Triangle
{
    public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
            double b,h,area;
            System.out.println("enter the height:");
            h=sc.nextDouble();
            System.out.println("enter the base:");
            b=sc.nextDouble();
            area= 0.5 * b * h;
            System.out.println("area of triangle:" +area);
        }
}