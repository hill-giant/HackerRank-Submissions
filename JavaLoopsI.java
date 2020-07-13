import java.util.Scanner;

public class LoopsI
{
    public static void printThatStuff(int n, int i)
    {
        System.out.printf("%d x %d = %d\n", n, 11 - i, n*(11-i));
        if (i == 1) return;
        printThatStuff(n, --i);
    }

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        printThatStuff(n, 10);
    }
}

