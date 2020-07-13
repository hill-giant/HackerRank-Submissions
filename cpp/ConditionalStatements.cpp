#include <bits/stdc++.h>

using namespace std;



int main()
{
    int n;
    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    string a = "";
    switch (n)
    {
        case 1:
            a = "one";
            break;
        case 2:
            a = "two";
            break;
        case 3:
            a = "three";
            break;
        case 4:
            a = "four";
            break;
        case 5:
            a = "five";
            break;
        case 6:
            a = "six";
            break;
        case 7:
            a = "seven";
            break;
        case 8:
            a = "eight";
            break;
        case 9:
            a = "nine";
            break;
        default:
            a = "Greater than 9";
            break;

    }
    cout << a << endl;
    return 0;
}

