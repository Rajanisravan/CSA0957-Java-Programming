import java.util.*;
class Remainder
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,quot,rem;
System.out.println("enter the n1");
n1=sc.nextInt();
System.out.println("enter the n2");
n2=sc.nextInt();
quot=n1/n2;
rem=n1%n2;
System.out.println("quotient:"+quot);
System.out.println("remainder:"+rem);
}
}
