
int  sum (int count,...) {
    va_list n;
    int sum = 0;
    va_start(n, count);
    for (int i = 0; i < count; i++) {
        sum += va_arg(n, int);
    }
    va_end(n);
    return sum;
}

int min(int count,...) {
    va_list n;
    va_start(n, count);
    int min = va_arg(n, int);
    int t;
    for (int i = 1; i < count; i++) {
        t = va_arg(n, int);
        if (t < min) {
            min = t;
        }
    }
    return min;
}

int max(int count,...) {
    va_list n;
    va_start(n, count);
    int max = va_arg(n, int);
    int t;
    for (int i = 1; i < count; i++) {
        t = va_arg(n, int);
        if (t > max) {
            max = t;
        }
    }
    return max;
}


