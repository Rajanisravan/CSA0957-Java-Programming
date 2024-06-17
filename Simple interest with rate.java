import java.util.*;
class Simple1
{
    public static void main(String args[]) 
{
        double p,t,si;
        char isSenior;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = sc.nextDouble();
        System.out.print("Enter the Time period : ");
        t = sc.nextDouble();
        System.out.print("Is the customer a senior citizen? (y/n): ");
        isSenior = sc.next().charAt(0);
        if (isSenior == 'y') {
        si=(p*t*12)/100;
        System.out.print("The Simple Interest is : " + si);
        }
        else
        {
        si = (p*t*10)/100;
        System.out.print("The Simple Interest is : " + si);
}
    }
}
