import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class JavaMD5
{
    public static void main(String[] args)
        throws NoSuchAlgorithmException
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(input.getBytes());
        byte[] digest = md.digest();
        String output = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println(output);
    }
}

