#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n;
    cin >> n;
    vector<int> v(n);
    for (auto i = 0; i < n; i++)
        cin >> v[i];
    int x,a,b;
    cin >> x >> a >> b;
    v.erase(v.begin() + --x);
    v.erase(v.begin() + --a, v.begin() + --b);
    cout << v.size() << endl;
    for (auto i = 0; i < v.size(); i++)
        cout << v[i] << " ";
    return 0;
}

