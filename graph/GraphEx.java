
import java.util.*;
public class GraphEx {

    int vertices;
    // declaring 2D array
    int matrix[][];

    int[] adjNode = new int[3];  // for adjacent node

    GraphEx(int vertices){
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public void addEdge(int source, int destination){
        // if has connection providing row and column as source and destination respectively
        matrix[source][destination] = 1;
        // if has connection in undirected graph
        matrix[destination][source] = 1;
    }

    // traverse each element in 2D array
    public void printMatrix(){
        for (int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    // get adjacent vertices
    public int[] getAdjNode(int i){
        int counter = 0;
        for(int j = 0; j < vertices; j++){
            if(matrix[i][j] != 0){
                adjNode[counter++] = j;
            }
        }
        return adjNode;
    }

    // main method
    public void printGraph(){
        for(int i = 0; i < vertices; i++){
            System.out.print(i + " is connected to ");
            for(int j = 0; j < vertices; j++){

                // checking connection or not, if it has connection i.e 1 then, print the value
                if((matrix[i][j]) != 0){
                    System.out.print(j + " , ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        GraphEx g = new GraphEx(5);
        // those have connection
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(2,4);
        g.addEdge(1, 3);
        g.addEdge(3, 4);

        g.printMatrix();
        g.printGraph();

        int result[] = g.getAdjNode(2);
        System.out.println(Arrays.toString(result));

    }

}
