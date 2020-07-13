import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class JavaSHA256
{
    public static void main(String[] args)
        throws NoSuchAlgorithmException
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] bytes = md.digest(input.getBytes());
        String output = DatatypeConverter.printHexBinary(bytes).toLowerCase();
        System.out.println(output);
    }
}

