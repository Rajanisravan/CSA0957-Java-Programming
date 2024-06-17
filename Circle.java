import java.util.*;
public class Circle
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        double r,area;
        System.out.println("enter the radius:");
        r=sc.nextInt();
        area=3.14 * r * r;
        System.out.println("radius:" +area);
     }
}