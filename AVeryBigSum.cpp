#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

long getSum(vector<int> arr){
    long sum = 0;
    for (int i = 0; i < arr.size(); i++)
        sum += arr.at(i);
    return sum;
}

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    cout << getSum(arr);
    return 0;
}

