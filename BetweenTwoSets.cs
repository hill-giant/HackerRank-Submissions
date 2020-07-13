using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    static int gcd(int[] a) {
        int result = a[0];

        for(int i = 1; i < a.Length; i++) {
            result = gcd(result, a[i]);
        }

        return result;
    }

    static int lcm(int a, int b) {
       return a * (b / gcd(a,b));
    }

    static int lcm(int[] a) {
        int result = a[0];

        for (int i = 1; i < a.Length; i++) {
            result = lcm(result, a[i]);
        }

        return result;
    }


    static int getTotalX(int[] a, int[] b) {
        int LCM = lcm(a);
        int GCD = gcd(b);
        int betweens = 0;

        for (int i = LCM, j = 2; i<=GCD; i=LCM*j, j++) {
            if(GCD%i==0) betweens++;
        }
        return betweens;
    }

    static void Main(string[] args) {
        TextWriter tw = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string[] nm = Console.ReadLine().Split(' ');

        int n = Convert.ToInt32(nm[0]);

        int m = Convert.ToInt32(nm[1]);

        int[] a = Array.ConvertAll(Console.ReadLine().Split(' '), aTemp => Convert.ToInt32(aTemp))
        ;

        int[] b = Array.ConvertAll(Console.ReadLine().Split(' '), bTemp => Convert.ToInt32(bTemp))
        ;
        int total = getTotalX(a, b);

        tw.WriteLine(total);

        tw.Flush();
        tw.Close();
    }
}

