import java.util.Scanner;

public class ArrayDS
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int[] a = new int[n];
        for (int i = a.length - 1; i >= 0; i--)
        {
            a[i] = k.nextInt();
        }
        for (int i : a)
        {
            System.out.print(i + " ");
        }
    }
}


