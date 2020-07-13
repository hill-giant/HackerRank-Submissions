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

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        UInt64 max = 1;
        UInt64 min = 4000000000;
        for (var i = 0; i < arr.Length; i++)
        {
            UInt64 sum = 0;
            for (var j = 0; j < arr.Length; j++)
            {
                if (i != j)
                {
                    sum += (UInt64)arr[j];
                }
            }
            max = Math.Max(sum,max);
            min = Math.Min(sum,min);
        }
        Console.WriteLine(min + " " + max);
    }

    static void Main(string[] args) {
        int[] arr = Array.ConvertAll(Console.ReadLine().Split(' '), arrTemp => Convert.ToInt32(arrTemp))
        ;
        miniMaxSum(arr);
    }
}

