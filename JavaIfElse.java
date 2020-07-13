import java.util.Scanner;

public class IfElse
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        String answer = (n%2 == 1||(n >= 6 && n <= 20))
                ? "Weird" : "Not Weird";
        System.out.println(answer);
    }
}

