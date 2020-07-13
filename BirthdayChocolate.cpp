#include <bits/stdc++.h>

using namespace std;

int solve(int n, vector < int > s, int d, int m){
    int sum = 0;
    int occurrence = 0;
    for (int i = 0; i < s.size(); i++){
        for (int j = i; j < i + m; j++)
            sum += s[j];
        if (sum == d)
            occurrence++;
        sum = 0;
    }
    return occurrence;
}

int main() {
    int n;
    cin >> n;
    vector<int> s(n);
    for(int s_i = 0; s_i < n; s_i++){
       cin >> s[s_i];
    }
    int d;
    int m;
    cin >> d >> m;
    int result = solve(n, s, d, m);
    cout << result << endl;
    return 0;
}

