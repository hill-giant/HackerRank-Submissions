using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static string timeConversion(string s) {
        char[] delimiters = { ':', 'A', 'P' };
        string[] time = s.Split(delimiters);
        if (s.Contains("PM") && !time[0].Equals("12"))
        {
            time[0] = "" + (Int32.Parse(time[0]) + 12);
        }
        else if (s.Contains("AM") && time[0].Equals("12"))
        {
            time[0] = "00";
        }
        return time[0] + ":" + time[1] + ":" + time[2];
    }

    static void Main(string[] args) {
        TextWriter tw = new StreamWriter(@System.Environment.GetEnvironmentVariable("OUTPUT_PATH"), true);

        string s = Console.ReadLine();

        string result = timeConversion(s);

        tw.WriteLine(result);

        tw.Flush();
        tw.Close();
    }
}

