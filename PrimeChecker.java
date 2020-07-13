import static java.lang.System.in;

class Prime
{
    public void checkPrime(int... arguments)
    {
        for (int i : arguments)
        {
            if (i <= 1)
                continue;
            else if (i <= 3)
                System.out.print(i + " ");
            else if (i % 2 == 0 || i % 3 == 0)
                continue;
            int j = 5;
            boolean provedFalse = false;
            while (j * j <= i && !provedFalse)
            {
                if (i % j == 0 || i % (j + 2) == 0)
                    provedFalse = true;
                j += 6;
            }
            if (!provedFalse && i > 3)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}
