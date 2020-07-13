import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try
        {
            int x = in.nextInt();
            int y = in.nextInt();
            System.out.println(x/y);
        }
        catch (InputMismatchException e)
        {
            System.out.println(e.getClass().getName());
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
