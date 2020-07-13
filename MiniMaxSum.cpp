#include <bits/stdc++.h>
#include <algorithm>

using namespace std;

int main() {
    vector<int> arr(5);
    long long int s1=0,s2=0,s3=0,s4=0,s5 = 0;
    for(int arr_i = 0; arr_i < 5; arr_i++){
       cin >> arr[arr_i];
        if (arr_i != 0) s1 += arr[arr_i];
        if (arr_i != 1) s2 += arr[arr_i];
        if (arr_i != 2) s3 += arr[arr_i];
        if (arr_i != 3) s4 += arr[arr_i];
        if (arr_i != 4) s5 += arr[arr_i];
    }
    long long int minimum = min(min(min(min(s1, s2), s3), s4), s5);
    long long int maximum = max(max(max(max(s1, s2), s3), s4), s5);

    cout << minimum << " " << maximum;

    return 0;
}

