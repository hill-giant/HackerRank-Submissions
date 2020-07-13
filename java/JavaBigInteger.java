import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerOps
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        BigInteger a = new BigInteger(kb.nextLine());
        BigInteger b = new BigInteger(kb.nextLine());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

