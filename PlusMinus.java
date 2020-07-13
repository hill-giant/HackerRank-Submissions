import java.util.Scanner;

public class PlusMinus
{
    static double[] countFractions(int[] a)
    {
        double[] fractions = {0, 0, 0};
        for (int i : a)
        {
            if (i > 0)
            {
                fractions[0]++;
            }
            else if (i < 0)
            {
                fractions[1]++;
            }
            else
            {
                fractions[2]++;
            }
        }
        return fractions;
    }
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = k.nextInt();
        }
        double[] f = countFractions(a);
        for (double i : f)
            System.out.println(i/a.length);

    }
}



