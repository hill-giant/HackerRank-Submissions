import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        for (int i = 0; i < n; i++)
        {
            String s = kb.nextLine();
            try
            {
                Pattern p = Pattern.compile(s);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e)
            {
                System.out.println("Invalid");
            }
        }
    }
}

