import java.util.Scanner;
import java.lang.Math;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                a[i][j] = k.nextInt();
            }
        }
        int primary = 0;
        int secondary = 0;
        for (int i = 0; i < a.length; i++)
        {
            primary += a[i][i];
            secondary += a[i][n - (i + 1)];
        }
        System.out.println(Math.abs(primary - secondary));         
   }
}


