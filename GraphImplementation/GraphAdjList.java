

// import SinglyLinkList.Node;

// package GraphImplementation;


public class GraphAdjList {
    SinglyLinkList[] a;
    int vertices;

    GraphAdjList(int vertices) {
        a = new SinglyLinkList[vertices];
        this.vertices = vertices;

        for (int i = 0; i < vertices; i++) {
            a[i] = new SinglyLinkList();

        }
    }

    public void addEdge(int source, int destination) {
        a[source].addNode(destination);
        a[destination].addNode(source);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " is connected to: ");
            for (int j = 0; j < a[i].getSize(); j++) {
                System.out.print(a[i].getDataAtAnyPos(j) + " , ");
            }
            System.out.println(" ");
        }
    }

    // time complexity : v + v*v
    public void printGraph1() {
        // System.out.println(a[0].head.next.data);
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " is connected to: ");
            SinglyLinkList.Node current = a[i].head;
            while (current != null) {
                System.out.print(current.data + " , ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // graph traversal BFS

    public void BFS(int rootNode){

        System.out.println("Printing BFS: ");
        // for visited element memorization
        boolean visited [] = new boolean[vertices];
        // for keeping visiting nodes
        QueueExample que = new QueueExample(vertices);

        // already partially visited so making it true;
        visited[rootNode] = true;
        que.enqueue(rootNode);

        // if que is not empty
        while (!que.isEmpty()){
            int x = que.dequeue();

            // getting adj nodes i.e [1,2,3]
            int adjlist[] = getAdjNode(x);

            for(int i = 0; i < adjlist.length; i++){
                int adjval = adjlist[i];  // we get each node value
                // check whether it is visited (true) or not visited (false)
                if(!visited[adjval]){
                    // if the node is visited then, insert in the queue
                    que.enqueue(adjval);

                    // after visiting, changing the boolean into true
                    visited[adjval] = true;
                }
            }
            // printing fully explored elements/nodes
            System.out.println(x);
            
        }
    }

    public void depthFirstSearch(int rootNode){
        boolean visited[] = new boolean[vertices];
        // partially visited
        visited[rootNode] = true;
        dfs(rootNode, visited);
    }

    public void dfs(int rootNode, boolean[] visited){
        System.out.println(rootNode);

        // getting adn nodes
        int list[] = getAdjNode(rootNode);

        for(int i = 0; i < list.length; i++){
            // getting each element
            int adjVal = list[i];

            if(!visited[adjVal]){
                visited[adjVal] = true;
                dfs(adjVal, visited);
            }
        }
    }

    // 
    // topological sorting using bfs
    public int[] topoSort(){
        int result[] = new int[vertices];
        int counter = -1;
        int indegree[] = new int[vertices];
        for(int i = 0; i< vertices; i++){
            int list[] = getAdjNode(i);
            for(int j = 0; j < list.length; j ++){
                int adjval = list[j];
                // now increasing degree value
                indegree[adjval] = indegree[adjval] + 1;
            }
        }

        
        QueueExample que = new QueueExample(vertices);
// now inserting into queue whose degree is zero
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                que.enqueue(i);
            }
        }
        // for detecting  cycle in directed graph
        int count = 0;
        while (!que.isEmpty()){
            count++;
            int x = que.dequeue();

            // inserting the result into array for turther use
            result[++counter] = x;

            System.out.println(x);

            // now for decreasing degree

            int list[] = getAdjNode(x);
            for(int i = 0; i < list.length; i++){
                int adjval = list[i];

                indegree[adjval]--;

                if(indegree[adjval] == 0){
                    que.enqueue(adjval);
                }
            }
        }
        if(count == vertices){
            System.out.println("cycle detected");
        }

        return result;

    }
// topologial sorting using dfs

    public void topoSortByDFS(){
        boolean visited[] = new boolean[vertices];
        StackExample stk = new StackExample(vertices);

        for(int i = 0; i< vertices; i++){
            if(!visited[i]){
                dfsToposort(i, visited, stk);
            }
        }

        for(int i = 0; i < vertices; i++){
            System.out.println(stk.pop());
        }
    }

    // recursively being called this method
    public void dfsToposort(int rootNode, boolean visited[], StackExample stk) {
        visited[rootNode] = true;
        stk = new StackExample(rootNode);
        int[] list = getAdjNode(rootNode);
        for(int i = 0; i < list.length; i++){
            int adjval = list[i];
            if(!visited[rootNode]){
                dfsToposort(rootNode, visited, stk);
            }
        }
        // stk.push(rootNode);
    }

    // greedy technique
    public void activitySolution(int start[], int finish[]) {
        int workNum = 1;
        // index for both arrays
        int k = 0;
        System.out.print("Activity choose : " + k);

        for (int i = 1; i< start.length; i++){
            if(start[i] >= finish[k]){
                k = i;
                workNum++;

                System.out.print( " --> " + k);
            }
        }
        System.out.println();
        System.out.println("No. of works : " + workNum);
    }
    // for detecing cycle algo in directed graph

    public boolean cycleDetect(){
        
        int indegree[] = new int[vertices];
        for(int i = 0; i< vertices; i++){
            int list[] = getAdjNode(i);
            for(int j = 0; j < list.length; j ++){
                int adjval = list[j];
                // now increasing degree value
                indegree[adjval] = indegree[adjval] + 1;
            }
        }

        
        QueueExample que = new QueueExample(vertices);
// now inserting into queue whose degree is zero
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                que.enqueue(i);
            }
        }
        // for detecting  cycle in directed graph
        int count = 0;
        // 
        while (!que.isEmpty()){
            count++;
            int x = que.dequeue();

            // inserting the result into array for turther use

            System.out.println(x);

            // now for decreasing degree

            int list[] = getAdjNode(x);
            for(int i = 0; i < list.length; i++){
                int adjval = list[i];

                indegree[adjval]--;

                if(indegree[adjval] == 0){
                    que.enqueue(adjval);
                }
            }
        }
        if(count == vertices){
            System.out.println("cycle detected");
            return true;
        }
        else {
            System.out.println("cycle is not deteced");
            return false;
        }
        

    }

    public int[] getAdjNode(int i) {
        int[] list = new int[a[i].getSize()];
        int indx = 0;
        SinglyLinkList.Node current = a[i].head;
        while (current != null) {
            System.out.print(current.data + " , ");
            current = current.next;
            list[indx++] = current.data;
        }
        return list;
    }

    public static void main(String[] args) {
        GraphAdjList g = new GraphAdjList(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.printGraph1();


        // g.BFS(0);
        // g.depthFirstSearch(0);

        // g.topoSort();

        int[] start = {1, 3, 2, 4, 8, 7, 9, 11, 9, 12};
        int[] finish = {3, 4, 5, 7, 9, 11, 12, 13, 14};

        g.activitySolution(start, finish);
    }
}
