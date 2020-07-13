#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
//Complete the following function.


void calculate_the_maximum(int n, int k) {
    int max_and = 0;
    int max_or  = 0;
    int max_xor = 0;
    for (int i = 1; i <= k; i++)
    {
        for (int j = i + 1; j <= n; j++)
        {
            int bit_and = i&j;
            int bit_or  = i|j;
            int bit_xor = i^j;
            if (bit_and > max_and && bit_and < k)
                max_and = bit_and;
            if (bit_or > max_or && bit_or < k)
                max_or = bit_or;
            if (bit_xor > max_xor && bit_xor < k)
                max_xor = bit_xor;
        }
    }
    printf("%d\n%d\n%d", max_and, max_or, max_xor);
}

int main() {
    int n, k;
  
    scanf("%d %d", &n, &k);
    calculate_the_maximum(n, k);
 
    return 0;
}

