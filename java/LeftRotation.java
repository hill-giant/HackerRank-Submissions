import java.util.Scanner;

public class LeftRotation
{
    static void rotateLeft(int[] a)
    {
        int temp = a[0];
        for (int i = 1; i < a.length; i++)
        {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
    }
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int m = k.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = k.nextInt();
        }
        for (int i = 0; i < m; i++)
        {
            rotateLeft(a);
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
        k.close();
    }
}

