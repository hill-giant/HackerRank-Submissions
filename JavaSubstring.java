import java.util.Scanner;

public class Substring
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        String s = k.nextLine();
        int start = k.nextInt();
        int end = k.nextInt();
        System.out.println(s.substring(start,end));
    }
}


