using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Numerics;

class Solution {

    static BigInteger factorial(int n) {
        if (n - 1 == 0) {
            return 1;
        } else {
            return n*factorial(n - 1);
        }
    }
    
    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(factorial(n));
    }
}

