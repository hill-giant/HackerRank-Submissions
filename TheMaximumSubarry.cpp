#include <vector>
#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        int m;
        cin >> m;
        int input;
        vector<int> v(m);
        for (int j = 0; j < m; j++) {
            cin >> v[j];
        }
        long int curr = v[0];
        long int mx = v[0];
        long int pos_sum = v[0] > 0 ? v[0] : 0;
        for (int j = 1; j < m; j++) {
            (curr <= 0) ? curr = v[j] : curr += v[j];
            if (curr > mx)
                mx = curr;
            if (v[j] > 0)
                pos_sum += v[j];
        }
        cout << mx << " "
            << (pos_sum > mx && pos_sum != 0 ? pos_sum : mx) << endl;

    }
    return 0;
}

