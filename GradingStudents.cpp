#include <bits/stdc++.h>

using namespace std;

vector < int > solve(vector < int > grades){
    for (ssize_t i = 0; i < grades.size(); i++)
        if (grades[i] >= 38)
            if (grades[i] % 5 > 2)
                grades[i] = grades[i] % 10 > 5 ?
                    grades[i] / 10 * 10 + 10 : grades[i] / 10 * 10 + 5;
    return grades;
}

int main() {
    int n;
    cin >> n;
    vector<int> grades(n);
    for(int grades_i = 0; grades_i < n; grades_i++){
       cin >> grades[grades_i];
    }
    vector < int > result = solve(grades);
    for (ssize_t i = 0; i < result.size(); i++) {
        cout << result[i] << endl;
    }
    return 0;
}

