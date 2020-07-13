import java.util.Scanner;

public class TwoDArrayDS
{
    static int readHourGlass(int startI, int startJ, int[][] a)
    {
        int sum = 0;
        for (int i = 0; i < 3; i++)
        {
            if (i == 1)
            {
                sum += a[startI + 1][startJ + 1];
            }
            else
            {
                for (int j = 0; j < 3; j++)
                {
                    sum += a[startI + i][startJ + j];
                }
            }
        }
        //System.out.println(sum);
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                a[i][j] = k.nextInt();
//                System.out.print(a[i][j]);
            }
//            System.out.println();
        }
        int max = -61;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                int sum = readHourGlass(i, j, a);
                if (sum > max)
                    max = sum;
            }
        }
        System.out.println(max);
    }
}

