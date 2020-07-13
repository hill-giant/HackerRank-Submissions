import java.util.Scanner;

public class OutputFormatting
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        String stringIn;
        int intIn;
        for (int i = 0; i < 32; i++)
        {
            System.out.print("=");
        }
        System.out.println();
        for (int i = 0; i < 3; i++)
        {
            stringIn = k.next();
            intIn = k.nextInt();
            System.out.printf("%-15s%03d\n", stringIn, intIn);
        }
        for (int i = 0; i < 32; i++)
        {
           System.out.print("=");
        }
    }
}

