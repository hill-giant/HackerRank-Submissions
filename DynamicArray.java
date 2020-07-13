import java.util.Scanner;
import java.util.ArrayList;

public class DynamicArray
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        int m = k.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++)
        {
            a.add(i, new ArrayList<Integer>());
        }
        int last = 0;
        int in;
        int x;
        int y;
        for (int i = 0; i < m; i++)
        {
            in = k.nextInt();
            x = k.nextInt();
            y = k.nextInt();
            switch (in)
            {
                case 1:
                    a.get((x^last)%n).add(y);
                    break;
                case 2:
                    int index = (x^last)%n;
                    last = a.get((x^last)%n).get(y%a.get(index).size());
                    System.out.println(last);
                    break;
            }
        }
    }
}
