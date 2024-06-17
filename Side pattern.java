import java.util.*;
class Sidepattern
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    int i,j,rows;
    System.out.println("enter no of rows:");
    rows=sc.nextInt();
    for(i=1;i<=rows;i++)
    {
      for(j=1;j<=i;j++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
     for(i=rows-1;i>=1;i--)
     {
       for(j=1;j<=i;j++)
       {
          System.out.print(i);
      }
      System.out.println();
    }
  }
}
