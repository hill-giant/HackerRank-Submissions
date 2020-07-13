#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <sstream>
#include <algorithm>
using namespace std;


int main() {
    int n,q,i,j,c;
    cin >> n >> q;
    vector<vector<int>> v(n);
    for (i = 0; i < n; i++) {
        cin >> j;
        while (j-- > 0) {
            cin >> c;
            v[i].push_back(c);
        }
    }
    while (q-- > 0) {
        cin >> i >> j;
        cout << v[i][j] << endl;
    }
    return 0;
}

