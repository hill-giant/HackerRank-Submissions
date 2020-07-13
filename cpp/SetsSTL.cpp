#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    int q,y,x;
    set<int> s;
    cin >> q;
    for (auto i = 0; i < q; i++) {
        cin >> y >> x;
        if (y == 1)
            s.insert(x);        
        else if(y == 2)
            s.erase(x);
        else if (y == 3)
            cout << ((s.find(x) != s.end()) ? "Yes" : "No") << endl;
    }
    return 0;
}




