
/*
 * Create the function factorial here
 */
function factorial(n) {
    var factorial = 1;
    while (n > 0) {
        factorial = factorial * n--;
    }

    return factorial;
}


/*
 * Create the function factorial here
 */
function factorial(n) {
    if (n > 1)
        return n * (factorial(--n));
    else
        return n;
}

