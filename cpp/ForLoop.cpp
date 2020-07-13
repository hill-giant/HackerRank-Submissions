#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int a,b;
    string s;
    cin >> a >> b;
    while (a <= b)
    {
        switch(a)
        {
            case 1:
                s = "one";
                break;
            case 2:
                s = "two";
                break;
            case 3:
                s = "three";
                break;
            case 4:
                s = "four";
                break;
            case 5:
                s = "five";
                break;
            case 6:
                s = "six";
                break;
            case 7:
                s = "seven";
                break;
            case 8:
                s = "eight";
                break;
            case 9:
                s = "nine";
                break;
            default:
                s = (a%2 == 0) ? "even" : "odd";
                break;
        }
        cout << s << endl;
        a++;
    }
    return 0;
}

