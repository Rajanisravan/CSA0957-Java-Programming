import java.util.*;
class Binary
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n,b=0,count=0;
System.out.println("enter the number");
n=sc.nextInt();
while(n!=0)
{
b+=(n%10)*Math.pow(2,count);
n/=10;
count++;
}
System.out.println("Binary value:"+b);
}
}
