import java.util.Scanner;

public class CompareTheTriplets
{
    static int[] compareTriplets
    (
        int[] a,
        int[] b
    )
    {
        int[] r = { 0, 0 };
        for (int i = 0; i < 3; i++)
        {
            if (a[i] > b[i]) r[0]++;
            if (a[i] < b[i]) r[1]++;
        }
        return r;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        for (int i = 0; i < 3; i++)
        {
            a[i] = keyboard.nextInt();
        }
        for (int i = 0; i < 3; i++)
        {
            b[i] = keyboard.nextInt();
        }
        int[] r = compareTriplets(a, b);
        System.out.println(r[0] + " " + r[1]);
    }
}


