
int lexicographic_sort(const char* a, const char* b) {
    return strcmp(a,b);
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    return strcmp(b,a);
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    int iA = strlen(a);
    int iB = strlen(b);
    int arrA[26] = {0};
    int arrB[26] = {0};
    int uniqA = 0;
    int uniqB = 0;
    while (--iA >= 0) {
        if (arrA[(int)(a[iA]) - 97]++ == 0) {
            uniqA++;
        }
    }
    while (--iB >= 0) {
        if (arrB[(int)(b[iB]) - 97]++ == 0) {
            uniqB++;
        }
    }
    int result = (uniqA > uniqB) - (uniqA < uniqB);
    return (result == 0) ? lexicographic_sort(a,b) : result;
}

int sort_by_length(const char* a, const char* b) {
    int result = (strlen(a) > strlen(b)) - (strlen(a) < strlen(b));
    return (result == 0) ? lexicographic_sort(a,b) : result;
}

void string_sort(char** arr,const int len,int (*cmp_func)(const char* a, const char* b)){
    for (int i = 1; i < len; i++) {
        for (int j = i; j > 0 && cmp_func(arr[j-1],arr[j]) > 0; j--) {
            char* t = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = t;
        }
    }
}


