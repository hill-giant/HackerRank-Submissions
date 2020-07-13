import java.util.Scanner;

public class JavaDatatypes
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        for (int i = 0; i < n; i++)
        {
            String input = k.next();
            try
            {
                Long.parseLong(input);
                System.out.printf("%s can be fitted in:\n", input);
            }
            catch (Exception e)
            {
                System.out.printf("%s can't be fitted anywhere.\n", input);
                continue;
            }
            try
            {
                Byte.parseByte(input);
                System.out.println("* byte");
            }
            catch (Exception e){}
            try
            {
                Short.parseShort(input);
                System.out.println("* short");
            }
            catch (Exception e){}
            try
            {
                Integer.parseInt(input);
                System.out.println("* int");
            }
            catch (Exception e){}
            try
            {
                Long.parseLong(input);
                System.out.println("* long");
            }
            catch (Exception e){}
        }
    }
}

