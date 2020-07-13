#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    string time;
    cin >> time;
    if (time.find("PM") != -1 && time.substr(0,2).compare("12") != 0)
        time.replace(0, 2, to_string(stoi(time.substr(0,2))+12));    
    if (time.find("AM") != -1 && time.substr(0,2).compare("12") == 0)
        time.replace(0, 2, "00");
    time.erase(time.end()-2,time.end());
    cout << time;
    return 0;
}

