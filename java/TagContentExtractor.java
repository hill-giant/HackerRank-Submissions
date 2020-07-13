import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TagContentExtractor
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = Integer.parseInt(kb.nextLine());
        String s;
        boolean matchFound;
        Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m;
        while (n-- > 0)
        {
            matchFound = false;
            s = kb.nextLine();
            m = p.matcher(s);
            while (m.find())
            {
                matchFound = true;
                System.out.println(m.group(2));
            }
            if (!matchFound)
            {
                System.out.println("None");
            }
        }
    }

}
        


