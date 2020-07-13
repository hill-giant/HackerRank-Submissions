import java.util.Scanner;

public class StringTokens
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String s = kb.nextLine().trim();
        String[] r = s.split("[\\p{Punct}\\s\\t]+");
        if (r.length == 1 && r[0].equals(""))
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(r.length);
            for (String a : r)
            {
               System.out.println(a);
            }
        }
    }
}

