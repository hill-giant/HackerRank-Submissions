#include <iostream>

using namespace std;

int main(){
    int x1;
    int x2;
    int v1;
    int v2;
    cin >> x1 >> v1 >> x2 >> v2;
    cout << ((x2 - x1) % (v1 - v2) == 0 && v1 > v2 ? "YES" : "NO");
}
