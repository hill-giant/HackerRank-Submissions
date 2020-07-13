import java.util.Scanner;
import java.util.BitSet;

public class JavaBitSet
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.nextLine();
        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);
        String operation;
        int a, b;
        while (m-- > 0)
        {
            operation = in.next();
            a = in.nextInt();
            b = in.nextInt();
            BitSet first;
            BitSet second;
            switch (operation)
            {
                case "AND":
                    first = (a == 1) ? B1 : B2;
                    second = (b == 1) ? B1 : B2;
                    first.and(second);
                    break;
                case "SET":
                    if (a == 1)
                        B1.set(b);
                    else
                        B2.set(b);
                    break;
                case "FLIP":
                    if (a == 1)
                        B1.flip(b);
                    else
                        B2.flip(b);
                    break;
                case "OR":
                    first = (a == 1) ? B1 : B2;
                    second = (a == 1) ? B2 : B1;
                    first.or(second);
                    break;
                case "XOR":
                    first = (a == 1) ? B1 : B2;
                    second = (a == 1) ? B2 : B1;
                    first.xor(second);
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }
    }
}

