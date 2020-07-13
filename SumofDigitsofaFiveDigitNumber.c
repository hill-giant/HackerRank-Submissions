#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int n;
    scanf("%d", &n);
    char num[10];
    sprintf(num, "%d", n);
    int sum = 0;
    for (int i = 0; i < 5; i++)
    {
        sum += num[i] - '0';
    }
    printf("%d", sum);
    return 0;
}
