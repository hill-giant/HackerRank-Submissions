#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;


int main() {
    int n,q,s;
    string p;
    cin >> n;
    map<string,int> m;
    while (n--) {
        cin >> q >> p;
        if (q == 1) {
            cin >> s;
            m[p] += s;
        } else if (q == 2) {
            m[p] = 0;
        } else if (q == 3) {
            cout << m[p] << endl;
        }
    }
    return 0;
}




