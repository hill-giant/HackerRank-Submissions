#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    char num[1000];
    int digits[10] = {0};
    int i;
    scanf("%s",num);
    for (i = 0; i < strlen(num); i++) {
        if (num[i] >= '0' && num[i] <= '9') {
            digits[(int)(num[i] - '0')]++;
        }
    }
    for (i = 0; i < 10; i++) {
        char *format = (i == 9) ? "%d" : "%d ";
        printf(format, digits[i]);
    }
    return 0;
}

