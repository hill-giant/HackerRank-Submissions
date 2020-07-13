import java.util.Scanner;
import java.util.Hashtable;
import java.util.Stack;
import java.io.File;
public class Array1D
{
    static boolean debug = false;
    static boolean readDoc = false;
    public static boolean canWin(int l, int[] game)
    {
        int i = 0;
        boolean stuck = false;
        return canWin(l, game, i);
    }
    private static boolean canWin(int l, int[] game, int i)
    {
        int n = game.length;
        if (i < 0 || game[i] == 1) return false;
        if (i >= n - 1 || i + l >= n) return true;
        game[i] = 1;
        return canWin(l, game, i + 1) || canWin(l, game, i + l) || canWin(l, game, i - 1);
    }

    private static void pause()
    {
        Scanner kb = new Scanner(System.in);
        kb.nextLine();
    }
    
    public static void main(String[] args)
    {
        try 
        {
            Scanner kb = (readDoc) ? new Scanner(new File("input03.txt")) 
                : new Scanner(System.in);
            int q = kb.nextInt();
            int s = q;
            while (q-- > 0)
            {
                int n = kb.nextInt();
                int l = kb.nextInt();
                int[] game = new int[n];
                for (int i = 0; i < n; i++)
                {
                    game[i] = kb.nextInt();
                }
                if (debug) System.out.println(s - q);
                System.out.println((canWin(l, game)) ? "YES" : "NO");
                if (debug) pause();    
            }
            kb.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

