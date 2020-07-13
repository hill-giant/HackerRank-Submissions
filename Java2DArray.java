import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int max = -63;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                int val = 0;
                for (int k = i; k < i + 3 ; k++)
                {
                    if (k == i + 1)
                        val += arr[k][j+1];
                    else
                        for (int l = j; l < j + 3; l++)
                        {
                            val += arr[k][l];
                        }
                }
                if (val > max) max = val;
            }
        }
        System.out.println(max);
    }
}

