#include <iostream>
#include <vector>
#include <string>
#include <fstream>
#include <stack>

using namespace std;

struct Edge{
    int source, destination;
};

class Graph{
    public:
    vector< vector<int> > adj;

    Graph(int n, vector<Edge> edges){
        adj.assign(n, vector<int>());
        for (int i = 0; i < edges.size(); ++i){
            int source = edges[i].source;
            int destination = edges[i].destination;
            
            adj[source].push_back(destination);
            adj[destination].push_back(source);
        }
    }
};

bool args_testing = false;
vector <bool> visited;
int m;
long x;
long y;
int paved_roads;

void DFS(Graph const &graph, int v){
    visited[v] = true;
    for (int i : graph.adj[v]){
        if (!visited[i]){
            ++paved_roads;
            DFS(graph, i);
        }
    }
}

int main(int argc, char * argv[]){
    ifstream read(argv[1]);
    int q;
    ((args_testing) ? read : cin) >> q;
    int n;
    for(int a0 = 0; a0 < q; a0++){
        long total = 0;
        ((args_testing) ? read : cin) >> n >> m >> x >> y;
        vector<Edge> edges;
        visited.assign(n, false);
        paved_roads = 0;
        for (int i = 0; i < m; i++){
            int city_1;
            int city_2;
            ((args_testing) ? read : cin) >> city_1 >> city_2;
            Edge e;
            e.source = city_1 - 1;
            e.destination = city_2 - 1;
            edges.push_back(e);
        }
        Graph graph(n, edges);
        if (x > y){
            for (int i = 0; i < n; ++i){
                if (!visited[i]){
                    DFS(graph, i);
                }
            }
            total = x*(n - paved_roads) + y*paved_roads;
        }else{
            total = x*n;
        }
        cout << total << "\n";
    }
    return 0;    
}
