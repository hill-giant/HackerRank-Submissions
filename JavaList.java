import java.util.Scanner;
import java.util.ArrayList;

public class JavaList
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Integer> l = new ArrayList<Integer>(n);
        while (n-- > 0)
        {
            int val = kb.nextInt();
            l.add(val);
        }
        int q = kb.nextInt();
        String in;
        int x, y;
        while (q-- > 0)
        {
            kb.nextLine();
            in = kb.nextLine();
            switch (in)
            {
                case "Insert":
                    x = kb.nextInt();
                    y = kb.nextInt();
                    l.add(x, y);
                break;

                case "Delete":
                    x = kb.nextInt();
                    l.remove(x);
                break;
            }
        }
        for (int i = 0; i < l.size(); i++)
        {
            System.out.print(l.get(i) + " ");
        }
    }
}

