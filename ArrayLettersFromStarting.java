import java.util.Arrays;  
import java.util.Scanner;

public class ArrayLettersFromStarting  
{  
   public static void main(String args[])   
   {  
      Scanner sc=new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);

      int n;   
      System.out.println("Enter the number of elements ");
      n=sc.nextInt();     
      String str[]=new String[n];  
      System.out.println("Enter the String ");
      for(int i=0; i<n ;i++)     
      {
          str[i]=sc1.nextLine();
      }

      Arrays.sort(str);    
      System.out.println(Arrays.toString(str));  //Display the array
   }  
}  