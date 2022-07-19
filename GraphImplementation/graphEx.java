// package GraphImplementation;

public class graphEx {
    int vertices;

    // declare of 2D array
    int [][] matrix;

    graphEx(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }
    public void addEdge(int source, int destination, int weight){
        matrix[source][destination] = weight;
        matrix[destination][source] = weight;

    }

    // dijkstra

    public void dijkstra(int source, int destination){
        int[] distance = new int[vertices];
        boolean[] visited = new boolean[vertices];
        int[] prevpath = new int[vertices];

        for (int i = 0; i < vertices; i++){
            distance[i] = Integer.MAX_VALUE;
            prevpath[i] = -1;
                
        }

        // distance bewteeen start and start poin t is alwways 0 
        distance[source] = 0;
        //  find minimum vertex
        for(int i = 0; i < vertices; i++){
            int u = findMinVertex(visited, distance);

            // after getting min vertex
            visited[u] = true;

            // get adjacent nodes
            for(int j =0; j < vertices; j++){
                // this is called relaxation: updateing 
                if(matrix[i][j]!=0){
                    // next comming destination
                    int v = j;

                    int newDistance = distance[u] + matrix[u][j];

                    if(newDistance < distance[v]){
                        distance[v] = newDistance;
                        // from where it comes u --> v
                        prevpath[v] = u;
                    }
                }
            }
            
        }

        System.out.println("Distance from source : " + source + " to destination " + destination + " is = " + distance[destination]);
        
        // print shortest path

        int crawl = destination; // 5
            
        int path[] = new int[vertices];
        int indx = 0;

        // 
        while(crawl != -1){
            path[indx] = crawl;
            indx++;
            // update 
            crawl = prevpath[crawl];

            for(int i = indx; i >= 0; i--){
                System.out.println(path[i]);
            }
        }

    }

    public int findMinVertex(boolean[] visited, int distance[]){

        // we dont know min vertex at first
        int min_vertex = -1;
        // compaing with each element
        for(int i = 0; i < vertices; i++){

            // for the first time
            if((min_vertex == -1 || distance[i] < distance[min_vertex]) && !visited[i]){

                
                min_vertex = i;
            }

            // if(distance[i] < distance[min_vertex] && !visited[i]){
            //     min_vertex = i;
            // }

        }
        return min_vertex;
    }
    public void printMatrix(){
        for(int i = 0; i< vertices; i++){
            for(int j =0; j<vertices; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    public void printGraph(){
        for(int i = 0; i < vertices; i++){
            System.out.print(i +" is connect too ");
            for(int j =0; j < vertices; j++){
                if(matrix[i][j]!=0){
                    System.out.print(j+" , ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        graphEx g = new graphEx(6);
        // g.addEdge(0, 1,);
        // g.addEdge(0,2);
        // g.addEdge(1,3);
        // g.addEdge(2,3);
        // g.addEdge(2,4);
        // g.addEdge(3,4);

        g.addEdge(0, 1, 10);
        g.addEdge(0,2, 5);
        g.addEdge(0,5, 100);

        g.addEdge(1, 3, 20);
        g.addEdge(1,2, 2);
        g.addEdge(2,4, 15);

        g.addEdge(3, 5, 20);
        g.addEdge(3,4, 5);
        g.addEdge(4,5, 15);
        g.printMatrix();
        g.printGraph();
    }
}
