#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main(){
    int n;
    cin >> n;
    double f1, f2, f3 = 0;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
       if (arr[arr_i] > 0) f1++;
       else if (arr[arr_i] < 0) f2++;
       else f3++;
    }
    cout << f1/n << endl << f2/n << endl << f3/n;
    return 0;
}

