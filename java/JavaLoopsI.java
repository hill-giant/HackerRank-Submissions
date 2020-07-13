import java.util.Scanner;

public class LoopsI
{
    public static void printThatShit(int n, int i)
    {
        System.out.printf("%d x %d = %d\n", n, 11 - i, n*(11-i));
        if (i == 1) return;
        printThatShit(n, --i);
    }

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        printThatShit(n, 10);
    }
}

