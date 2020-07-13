#include <iostream>
#include <string>
#include <vector>

using namespace std;

int compareBigNum(string a, string b){
    if (a.size() > b.size())
        return 1;
    if (a.size() < b.size())
        return -1;
    for (int i = 0; i < a.size(); i++){
        if (a.at(i) - '0' != b.at(i) - '0')
           return (a.at(i) - '0' > b.at(i) - '0') ? 1 : -1;
    }
    return 0;
}

void merge(vector<string> &a, vector<string> &b, int ls, int rs, int re){
    int le = rs - 1;
    int p = ls;
    int ils = ls;
    while (ls <= le && rs <= re)
        b[p++] = compareBigNum(a[ls], a[rs]) == -1 ? a[ls++] : a[rs++];
    while (ls <= le) b[p++] = a[ls++];
    while (rs <= re) b[p++] = a[rs++];
    for (int i = ils; i <= re; i++){
        a[i] = b[i];
    }
}

void mergeSort(vector<string> &a, vector<string> &b, int lo, int hi){
    if (lo < hi){
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, b, lo, mid);
        mergeSort(a, b, mid + 1, hi);
        merge(a, b, lo, mid + 1, hi);
    }
}

void mergeSort(vector<string> &u){
    vector<string> t(u.size());
    mergeSort(u, t, 0, u.size() - 1);
}


int main(){
    int n;
    cin >> n;
    vector<string> unsorted(n);
    for (int i = 0; i < n; ++i){
        cin >> unsorted[i];
    }
    mergeSort(unsorted);
    for (int i = 0; i < n; ++i)
        cout << unsorted[i] << endl;

    return 0;
}

