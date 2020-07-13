using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int[] solve(int[] a, int[] b){
        int[] s = {0 , 0};
        for (int i = 0; i < a.Length; i++) {
            if (a[i] > b[i]) {
                s[0]++;
            } else if (a[i] < b[i]) {
                s[1]++;
            }
        }
        return s;
    }

    static void Main(String[] args) {
        string[] tokens_a0 = Console.ReadLine().Split(' ');
        int[] a = new int[3];
        a[0] = Convert.ToInt32(tokens_a0[0]);
        a[1] = Convert.ToInt32(tokens_a0[1]);
        a[2] = Convert.ToInt32(tokens_a0[2]);
        string[] tokens_b0 = Console.ReadLine().Split(' ');
        int[] b = new int[3];
        b[0] = Convert.ToInt32(tokens_b0[0]);
        b[1] = Convert.ToInt32(tokens_b0[1]);
        b[2] = Convert.ToInt32(tokens_b0[2]);
        int[] result = solve(a, b);
        Console.WriteLine(String.Join(" ", result));
    }
}

﻿using System;
using System.Linq;

namespace compare_the_triplets
{
    class Program
    {
        static void Main(string[] args)
        {
            int[] a;
            int[] b;
            int a_score = 0;
            int b_score = 0;
            String input;
            input = Console.ReadLine();
            a = input.Split(' ').Select(str => Convert.ToInt32(str)).ToArray();
            input = Console.ReadLine();
            b = input.Split(' ').Select(str => Convert.ToInt32(str)).ToArray();
            for (int i = 0; i < a.Length; i++)
            {
                if (a[i] > b[i])
                    a_score++;
                else if (b[i] > a[i])
                    b_score++;
            }
            Console.WriteLine(a_score + " " + b_score);
        }
    }
}

