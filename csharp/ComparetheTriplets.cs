using System;
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

