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

    // Complete the dayOfProgrammer function below.
    static string dayOfProgrammer(int year) {
        int day = 13;

        if (year < 1919)
        {
            if (year % 4 == 0)
            {
                day = 256 - 244;
            }
            else if (year == 1918)
            {
                day = 256 - 230;
            }
        }
        else
        {
            if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
            {
                day = 256 - 244;
            }
        }

        return day + ".09." + year;
    }

    static void Main(string[] args) {
        TextWriter textWriter = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        int year = Convert.ToInt32(Console.ReadLine());

        string result = dayOfProgrammer(year);

        textWriter.WriteLine(result);

        textWriter.Flush();
        textWriter.Close();
    }
}

