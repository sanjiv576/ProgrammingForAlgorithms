// package GraphImplementation;

public class graphEx {
    int vertices;

    // declare of 2D array
    int [][] matrix;

    graphEx(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }
    public void addEdge(int source, int destination){
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;

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
        graphEx g = new graphEx(5);
        g.addEdge(0, 1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(3,4);
        g.printMatrix();
        g.printGraph();
    }
}
