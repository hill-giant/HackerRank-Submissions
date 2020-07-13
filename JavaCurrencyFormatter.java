import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class CurrencyFormatter
{
    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        double d = k.nextDouble();
        Locale locale = new Locale("en", "IN");
        Locale[] locales =
        {
            Locale.US,
            locale,
            Locale.CHINA,
            Locale.FRANCE
        };
        String[] formats = new String[4];
        NumberFormat nf;
        for (int i = 0; i < locales.length; i++)
        {
            nf = NumberFormat.getCurrencyInstance(locales[i]);
            formats[i] = nf.format(d);
        }
        System.out.printf("US: %s\nIndia: %s\nChina: %s\nFrance: %s",
                formats[0], formats[1], formats[2], formats[3]);
    }
}

