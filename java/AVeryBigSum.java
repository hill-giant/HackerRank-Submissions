import java.util.Scanner;

public class VeryBigSum
{
    static long bigSum(long[] a)
    {
        long result = 0;
        for (long i : a)
            result += i;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = kbd.nextLong();
        long result = bigSum(a);
        System.out.println(result);
    }
}

