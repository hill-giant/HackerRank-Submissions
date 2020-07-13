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

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<int> arr) {
        var dict = new Dictionary<int,int>();
        int maxCount = 0;
        int minKey = 5;

        foreach (var n in arr)
        {
            if (dict.ContainsKey(n))
            {
                dict[n]++;
            }
            else
            {
                dict.Add(n,1);
            }

            if (dict[n] > maxCount)
            {
                maxCount = dict[n];
            }
        }

        foreach (KeyValuePair<int, int> kv in dict)
        {
            if (kv.Value == maxCount && kv.Key < minKey)
            {
                minKey = kv.Key;
            }
        }

        return minKey;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int arrCount = Convert.ToInt32(Console.ReadLine().Trim());

        List<int> arr = Console.ReadLine().TrimEnd().Split(' ').ToList().Select(arrTemp => Convert.ToInt32(arrTemp)).ToList();

        int result = migratoryBirds(arr);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}

