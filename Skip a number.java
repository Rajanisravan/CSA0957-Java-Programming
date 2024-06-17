import java.util.*;
class Skip
{
    public static void main(String args[]) 
{
        int m,k,n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m : ");
        m= sc.nextInt();
        System.out.print("Enter the n : ");
        n = sc.nextInt();
        System.out.print("Enter the k: ");
        k= sc.nextInt();
        for(i=m;i<=n;i=i+k+1)
        {
        System.out.print(" " +i);
        }
}
}
