import java.util.Scanner;

public class SimpleArraySum 
{
    static int simpleArraySum
    (
        int n,
        int[] a
    )
    {
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = keyboard.nextInt();
        }
        int result = simpleArraySum(n, a);
        System.out.println(result);
    }
}


