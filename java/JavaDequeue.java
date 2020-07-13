import java.util.Deque;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.io.*;
public class JavaDequeue
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<Integer>();
        Deque subDeque = new ArrayDeque<Integer>();
        HashSet set = new HashSet<Integer>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = 0;
        int num;
        for (int i = 0; i < n; i++)
        {
            num = in.nextInt();
            deque.push(num);
        }
        while (subDeque.size() < m)
        {
            subDeque.offer(deque.poll());
            set.add(subDeque.peekLast());
        }
        max = set.size();
        while (!deque.isEmpty() && set.size() <= m)
        {
            subDeque.offer(deque.poll());
            if (set.size() > max)
                max = set.size();
            set.add(subDeque.peekLast());
            int removed = (int)subDeque.poll();
            if (!subDeque.contains(removed))
                set.remove(removed);
        }
        System.out.println(max);        
    }
}

