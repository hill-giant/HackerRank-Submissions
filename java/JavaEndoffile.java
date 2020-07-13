import java.util.Scanner;

public class EndOfFile
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        String line;
        int n = 1;
        while (k.hasNextLine())
        {
            line = k.nextLine();
            System.out.printf("%d %s\n", n++, line);
        }
    }
}

