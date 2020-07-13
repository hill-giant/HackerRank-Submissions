    PerformOperation isOdd() {  
        return (a) -> !(a%2 == 0);
    }

    PerformOperation isPrime() { 
        return (a) -> {
            for (int i = 2; i < a - 1; i++)
            {
                if (a%i == 0)
                    return false;
            }
            return true;
        };
    }

    PerformOperation isPalindrome() {
        return (a) -> {
            int n = a;
            int rev = 0;
            int dig;
            while (n > 0)
            {
                dig = n % 10;
                rev = rev * 10 + dig;
                n = n / 10;
            }
            return rev == a;
        };
    }
}
