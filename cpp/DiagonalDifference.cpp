#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n;
    cin >> n;
    vector< vector<int> > a(n,vector<int>(n));
    for(int a_i = 0;a_i < n;a_i++){
       for(int a_j = 0;a_j < n;a_j++){
          cin >> a[a_i][a_j];
       }
    }
    int sum_1, sum_2 = 0;
    for (int a_i = 0; a_i < n; a_i++){
        sum_1+=a[a_i][a_i];
        sum_2+=a[a_i][n-1-a_i];
    }
    cout << abs(sum_1-sum_2);
    return 0;
}

