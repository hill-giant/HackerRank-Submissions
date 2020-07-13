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
    int q,r;
    vector<int>::iterator lb;
    cin >> q;
    for (auto i = 0; i < q; i++) {
        cin >> r;
        lb = lower_bound(v.begin(), v.end(), r);
        if (*lb != r) {
            cout << "No ";
            while (*lb != r && r <= *v.end()) {
                lb = lower_bound(v.begin(), v.end(), r);
                if (*lb != r) {
                    r++;
                }
            }
        } else {
            cout << "Yes ";
        }
        cout << lb - v.begin() + 1 << endl;
    }
    return 0;
}

