import java.util.*;
public class VolOfSphere
{
    public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
            Double r,area;
            System.out.println("enter the number:");
            r=sc.nextDouble();
            area=4/3*3.14*r*r*r;
            System.out.println("volume of sphere:" +area);
         }
}