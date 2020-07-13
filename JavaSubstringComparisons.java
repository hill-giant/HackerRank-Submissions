import java.util.Scanner;

public class SubstringComparisons
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int k = in.nextInt();
        String hi = s.substring(0,k);
        String lo = s.substring(0,k);
        for (int i = 0; i < s.length() - k + 1; i++)
        {
            if (s.substring(i,i + k).compareTo(hi) >= 1)
            {
                hi = s.substring(i,i + k);
            }
            else if (s.substring(i,i + k).compareTo(lo) <= -1)
            {
                lo = s.substring(i,i + k);
            }
        }
        System.out.printf("%s\n%s", lo, hi);
    }
}

