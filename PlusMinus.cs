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

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double plus = 0;
        double minus = 0;
        double zero = 0;

        foreach (int n in arr)
        {
            if (n > 0) plus  += 1 / (double)arr.Length;
            else if (n < 0) minus += 1 / (double)arr.Length;
            else if (n == 0) zero += 1 / (double)arr.Length;
        }
        Console.WriteLine(plus + "\n" + minus + "\n" + zero);
    }

    static void Main(string[] args) {
        int n = Convert.ToInt32(Console.ReadLine());

        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp))
        ;
        plusMinus(arr);
    }
}

