#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int next_permutation(int n, char **s)
{
    int k = -1;
    int i;
    char* t;
    for (i = n - 2; i >= 0 && k == -1; i--) {
        if (strcmp(s[i],s[i + 1]) < 0) k = i;
    }
    if (k == -1) return 0;
    int l = k + 1;
    for (i = k + 1; i < n; i++) {
        if (strcmp(s[i],s[k]) > 0 && strcmp(s[i],s[l]) < 0)  l = i;
    }
    t = s[l];
    s[l] = s[k];
    s[k] = t;
    for (i = k + 2; i < n; i++) {
        for (int j = i; j > k + 1 && strcmp(s[j-1],s[j]) > 0; j--) {
            t = s[j];
            s[j] = s[j-1];
            s[j-1] = t;
        }
    }
    return 1;
}


