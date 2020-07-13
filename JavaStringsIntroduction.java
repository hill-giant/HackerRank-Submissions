import java.util.Scanner;

public class Strings
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        String a = k.next();
        String b = k.next();
        int sum = a.length() + b.length();
        String aIsLarger = (a.compareTo(b) > 0) ? "Yes" : "No";
        String last = a.substring(0,1).toUpperCase() + a.substring(1)
            + " " + b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.printf("%d\n%s\n%s", sum, aIsLarger, last);

    }
}


