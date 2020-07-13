#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d",&n);
    int* arr = (int*)malloc(n*sizeof(int));
    int sum = 0;
    while (--n >= 0) {
        scanf("%d",&arr[n]);
        sum += arr[n];
    }
    printf("%d",sum);
    return 0;
}


