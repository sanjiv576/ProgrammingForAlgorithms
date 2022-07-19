
public class DisjointSet {

    int vertices;
    int parent[];
    int size[];
    DisjointSet(int vertices){
        this.vertices = vertices;
        parent = new int[vertices];
        size = new int[vertices];

        // to find absolute root, 
        for(int i = 0; i < vertices; i++){
            parent[i] = -1;
        }

    }

    boolean cycleDetected(int u, int v){

        int uRoot = find(u);
        int vRoot = find(v);
        if(uRoot == vRoot){
            System.out.println("Cycle detected");
            return true;
        }

        // if cycle is not detected then we combine two sets
        union(uRoot, vRoot);
        return false;
    }

    // check whehter in t
    int find(int u){
        // self root node
        if(parent[u] == -1){
            return u;
        }

        // path compression
        return parent[u] = find(parent[u]);
    }

    void union(int uRoot, int vRoot){
        if(size[uRoot] > size[vRoot]){
            parent[vRoot] = uRoot;
        }
        else if (size[uRoot] < size[vRoot]){
            parent[uRoot] = vRoot;

        }

        else {
            parent[vRoot] = uRoot;
            // absolute root node is 
            size[uRoot]++;
        }
    }

    public static void main(String[] args){
        DisjointSet d = new DisjointSet(4);
        d.cycleDetected(0, 1);
        d.cycleDetected(0, 2);
        d.cycleDetected(1, 3);
        d.cycleDetected(2, 3);
    }
    
}
