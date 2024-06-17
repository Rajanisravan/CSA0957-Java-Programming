import java.util.*;
public class MatrixAdd
{
    public static void main(String []args)
    {
        int a[][]={{1,2,1},{2,4,4}};
        int b[][]={{5,8,9},{3,5,8}};
        int c[][]=new int[2][3];
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
            }
            System.out.println();
        }
     }
}

