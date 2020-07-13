import java.util.Scanner;

public class Subarray
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = kb.nextInt();
        }
        int negs = 0;
        int sum;
        for (int i = 0; i < n; i++)
        {
            sum = 0;
            for (int j = i; j < n; j++)
            {
                sum += arr[j];
                if (sum < 0)
                    negs++;
            }
        }
        System.out.println(negs);
    }
}

import java.util.Scanner;

public class Subarray
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = kb.nextInt();
        }
        int negs = 0;
        int sum;
        for (int i = 0; i < n; i++)
        {
            sum = 0;
            for (int j = i; j < n; j++)
            {
                sum += arr[j];
                if (sum < 0)
                    negs++;
            }
        }
        System.out.println(negs);
    }
}

