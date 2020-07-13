import java.util.Scanner;
import java.util.Hashtable;

public class JavaMap
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        Hashtable book = new Hashtable<String,Integer>();
        for (int i = 0; i < n; i++)
        {
            String name = kb.nextLine();
            int phone = kb.nextInt();
            book.put(name, phone);
            kb.nextLine();
        }
        while (kb.hasNext())
        {
            String s = kb.nextLine();
            System.out.println(book.containsKey(s) ? s + "=" + book.get(s)
                    : "Not found");
        }
    }
}


