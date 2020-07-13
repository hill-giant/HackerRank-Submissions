using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;

class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Dictionary<Int32, Int32> socks = new Dictionary<Int32, Int32>();
        
        foreach (int sock in ar) {
            if (socks.ContainsKey(sock)) {
                socks[sock]++;
            } else {
                socks.Add(sock, 1);
            }
        }

        int pairs = 0;

        foreach (KeyValuePair<Int32,Int32> color in socks) {
            pairs += color.Value / 2;
        }

        return pairs;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int n = Convert.ToInt32(Console.ReadLine());

        int[] ar = Array.ConvertAll(Console.ReadLine().Split(' '), arTemp => Convert.ToInt32(arTemp))
        ;
        int result = sockMerchant(n, ar);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}

