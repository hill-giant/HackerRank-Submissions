import java.util.Stack;
import java.util.Scanner;

public class JavaStack
{
    public static boolean isBalanced(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i);
            if (curr == '{' || curr == '(' || curr == '[')
            {
                stack.push(curr);
            }
            else if (!stack.empty())
            {
                char top = stack.peek();
                if (curr == '}' && top != '{'
                  ||curr == '(' && top != '('
                  ||curr == ']' && top != '[')
                    return false;
                stack.pop();
            }
            else
            {
                return false;
            }
        }
        return stack.empty();
    }
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String s;
        while (kb.hasNext())
        {
            s = kb.nextLine();
            System.out.println(isBalanced(s));
        }
    }
}

