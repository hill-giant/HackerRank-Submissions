#include <bits/stdc++.h>

using namespace std;

int getTotalX(vector < int > a, vector < int > b){
    int k = 0;
    int upper = b[0];
    int lower = a[0];
    for_each(a.begin(), a.end(), [&](int x){lower = max(lower, x);});
    for_each(b.begin(), b.end(), [&](int x){upper = min(upper, x);});
    [&](int i){
        bool in_a = true;
        bool in_b = true;
        while (i < upper){

            i++;
            for_each(a.begin(), a.end(), [&](int x){
                if (i % x != 0 && in_a) in_a = false;
            });
            for_each(b.begin(), b.end(), [&](int x){
                if (x % i != 0 && in_b) in_b = false;
            });
            //cout << i << endl;
            if (in_a && in_b) k++;
            in_a = true;
            in_b = true;
        }
    }(lower - 1);
    return k;
}

int main() {
    int n;
    int m;
    cin >> n >> m;
    vector<int> a(n);
    for(int a_i = 0; a_i < n; a_i++){
       cin >> a[a_i];
    }
    vector<int> b(m);
    for(int b_i = 0; b_i < m; b_i++){
       cin >> b[b_i];
    }
    int total = getTotalX(a, b);
    cout << total << endl;
    return 0;
}

