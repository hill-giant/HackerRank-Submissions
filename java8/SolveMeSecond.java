import java.util.*;
import java.io.*;

public class Problem {
    
    public static int SolveMeSecond(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
    
        int t = in.nextInt();
        int a, b;
        int sum;
         
        for (int i = 0; i < t; i++){
            a = in.nextInt();
            b = in.nextInt();
        
            sum = SolveMeSecond(a,b);
            
            System.out.println(sum);
        }
    }
}
