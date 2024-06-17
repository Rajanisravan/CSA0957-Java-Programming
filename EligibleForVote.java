import java.util.*;
public class EligibleForVote
{
    public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
            int age;
            System.out.println("enter the age:");
            age=sc.nextInt();
            if(age>=18)
                System.out.println("eligible:" +age);
            else
                System.out.println("not eligible:" +age);
         }
}