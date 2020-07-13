import java.util.Scanner;
import java.util.ArrayList;

public class JavaArrayList
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList arrs = new ArrayList<ArrayList<Integer>>();
        int size;
        ArrayList<Integer> inner;
        for (int i = 0; i < n; i++)
        {
            arrs.add(new ArrayList<Integer>());
            size = kb.nextInt();
            inner = (ArrayList)arrs.get(i);
            for (int j = 0; j < size; j++)
            {
                inner.add(kb.nextInt());
            }
        }
        int x, y;
        n = kb.nextInt();
        for (int i = 0; i < n; i++)
        {
            x = kb.nextInt();
            y = kb.nextInt();
            try
            {
                inner = (ArrayList)arrs.get(--x);
                System.out.println(inner.get(--y));
            }
            catch (Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class JavaArrayList
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList arrs = new ArrayList<ArrayList<Integer>>();
        int size;
        ArrayList<Integer> inner;
        for (int i = 0; i < n; i++)
        {
            arrs.add(new ArrayList<Integer>());
            size = kb.nextInt();
            inner = (ArrayList)arrs.get(i);
            for (int j = 0; j < size; j++)
            {
                inner.add(kb.nextInt());
            }
        }
        int x, y;
        n = kb.nextInt();
        for (int i = 0; i < n; i++)
        {
            x = kb.nextInt();
            y = kb.nextInt();
            try
            {
                inner = (ArrayList)arrs.get(--x);
                System.out.println(inner.get(--y));
            }
            catch (Exception e)
            {
                System.out.println("ERROR!");
            }
        }
    }
}

