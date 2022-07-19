package minimum_spannning_tree;

import java.util.Arrays;

public class Krushkal {

    // static int vertices;

    // stores new added edges
    static Edge edges[];
    static int vertices;

    Krushkal(int vertices) {
        this.vertices = vertices;
        edges = new Edge[vertices];
    }

    public static class Edge implements Comparable<Edge> {

        // source
        int u;

        // destination
        int v;

        // weight
        int w;

        Edge(int u, int v, int w) {
            this.u = u;
            this.v = v;
            this.w = w;

        }

        // // store new added edge
        // Edge edges[];

        int indx = -1;

        void addEdge(int u, int v, int w) {
            edges[++indx] = new Edge(u, v, w);
        }

        // imp algo to be written in exam only this
        void krushkal() {
            // int mst[][] = new int[vertices][vertices];

            Edge[] mst = new Edge[vertices];

            int EdgeCounter = 0;
            int edgeTaken = 1;

            // first do sort, on the bases of weight, those which have least weight comes in
            // 0 index
            Arrays.sort(edges);

            int parent[] = new int[vertices];
            int size[] = new int[vertices];

            // if for the first time
            for (int i = 0; i < vertices; i++) {
                parent[i] = -1;
            }
            // always |V-1| edges, where
            while (edgeTaken <= vertices - 1) {
                Edge e = edges[++EdgeCounter];

                // edge ma cycle bancha ki bandai vanera check garnu paryo --> cycle detection
                if (find(e.u, parent, size) == find(e.v, parent, size)) {
                    continue;
                }

                // assigning weight
                // this is another option
                // mst[e.u][e.v] = e.w;
                // mst[e.v][e.u] = e.w;

                // this is another option
                int mstIndx = -1;
                mst[++mstIndx] = e;

                // now,
                union(e.u, e.v, parent, size);
                edgeTaken++;

            }
        }

        @Override
        public int compareTo(Edge o) {
            // TODO Auto-generated method stub
            return this.w - o.w;
        }
    }

    // reuse of this code from DisjointSet.java --> parent and size are added
    // not required to define function in exam, just call it
    int find(int u, int parent[], int size[]) {
        // self root node
        if (parent[u] == -1) {
            return u;
        }

        // path compression
        return parent[u] = find(parent[u], parent, size);
    }

    // reuse of this code from DisjointSet.java --> parent and size are added
    void union(int uRoot, int vRoot, int parent[], int size[]) {
        if (size[uRoot] > size[vRoot]) {
            parent[vRoot] = uRoot;
        } else if (size[uRoot] < size[vRoot]) {
            parent[uRoot] = vRoot;

        }

        else {
            parent[vRoot] = uRoot;
            // absolute root node is
            size[uRoot]++;
        }

    }

    // testing is not needed in the exam
    public static void main(String[] args) {

        Krushkal k = new Krushkal(5);
        k.addEdge(0, 1, 10);
    }

}
