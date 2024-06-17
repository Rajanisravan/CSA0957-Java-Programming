import java.util.*;
class Simple
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
double p,r,t,si;
System.out.println("enter the p");
p=sc.nextDouble();
System.out.println("enter the r");
r=sc.nextDouble();
System.out.println("enter the t");
t=sc.nextDouble();
si=p*t*r/100;
System.out.println("si:"+si);
}
