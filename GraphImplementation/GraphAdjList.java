

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
    }
}
