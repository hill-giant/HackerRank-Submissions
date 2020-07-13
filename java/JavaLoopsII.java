import java.util.Scanner;

public class LoopsII
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n;
        int a, b, c;
        n = k.nextInt();
        for (int i = 0; i < n; i++)
        {
            a = k.nextInt();
            b = k.nextInt();
            c = k.nextInt();
            for (int j = 0; j < c; j++)
            {
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println();
        }
    }
}
        

