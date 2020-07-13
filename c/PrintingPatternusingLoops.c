#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int n;
    scanf("%d", &n);
    int x = n;
    int y = 0;
    int z = 0;
    while (x > 0)
    {
        y = 0;
        while (y < n)
        {
            z = (n - y < x) ? x : n - y;
            printf("%d ", z);
            y++;
        }
        y--;
        while (y > 0)
        {
            y--;
            z = (n - y < x) ? x : n - y; 
            printf("%d ", z);
        }
        printf("\n");
        x--;
    }
    x++;
    while (x < n)
    {
        x++;
        y = 0;
        while (y < n)
        {
            z = (n - y < x) ? x : n - y;
            printf("%d ", z);
            y++;
        }
        y--;
        while (y > 0)
        {
            y--;
            z = (n - y < x) ? x : n - y;
            printf("%d ", z);
        }
        printf("\n");
    }
    
    return 0;
}
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{
    int n;
    scanf("%d", &n);
    int length = 2*n - 1;
    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < length; j++)
        {
            int min = (i < j) ? i : j;
            min = (min < length-i) ? min : length-i-1;
            min = (min < length-j-1) ? min : length-j-1;
            printf("%d ", n-min);
        }
        printf("\n");
    }
    
    return 0;
}
