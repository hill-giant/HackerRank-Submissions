#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int x1;
    int v1;
    int x2;
    int v2;
    cin >> x1 >> v1 >> x2 >> v2;
    int lead = (x1 >= x2) ? x1 : x2;
    int follow = (x1 >= x2) ? x2 : x1;
    int v_lead = (x1 >= x2) ? v1 : v2;
    int v_follow = (x1 >= x2) ? v2 : v1;
    while (lead > follow){
        lead += v_lead;
        follow += v_follow;
    }    
    cout << (lead == follow ? "YES" : "NO");
    return 0;
}

#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    int x1;
    int v1;
    int x2;
    int v2;
    cin >> x1 >> v1 >> x2 >> v2;
    cout << (v1 > v2 && (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO");
    return 0;
}

