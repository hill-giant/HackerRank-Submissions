import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine();
        boolean palindrome = true;
        int i = 0;
        while (palindrome && i < s.length())
        {
            palindrome = s.charAt(i) == s.charAt(s.length() - 1 - i);
            i++;
        }
        System.out.printf("%s", (palindrome) ? "Yes" : "No");
    }
}

