using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        int d = n - p;

        if (p == 1 || p == n)
        {
            return 0;
        }
        else if (p < d) {
            return p / 2;
        } else if (d == 1 && n%2 == 0) {
            return 1 + d / 2;
        } else {
            return d / 2;
        }
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        int p = Convert.ToInt32(Console.ReadLine());

        int result = pageCount(n, p);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}

