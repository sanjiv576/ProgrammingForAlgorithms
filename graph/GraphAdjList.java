
// public class GraphAdjList {
//     SinglyLInkedList[] a;
//     int vertices;

//     GraphAdjList(int vertices) {
//         a = new SinglyLInkedList[vertices];
//         this.vertices = vertices;

//         for (int i = 0; i < vertices; i++) {
//             a[i] = new SinglyLInkedList();
//         }
//     }

//     public void addEdge(int source, int destination){
//         a[source].addNode(destination);
//         a[destination].addNode(source);
//     }

//     public void printGraph(){
//         for(int i=0; i < vertices; i++){
//             System.out.print(i + " is connected to ");
//             for(int j = 0; j < a[i].getSize(); j++){
//                 System.out.print(a[i].getDataAtAnyPos(j) + " , ")
//             }
//             System.out.println();
//         }
//     }


//     public class SinglyLInkedList {
//         public static class Node {
    
//             // declaring data
//             int data;
    
//             // declaring address of the data
//             // NOte: generally, next is prefered to create variable for storing address in Linked list
//             Node next;
    
//             Node(int data){
//                 this.data = data;
//                 // first off, address of the first element or head of the Linked list is null
//                 this.next = null;
//             }
            
            
//             Node head = null;
//             Node tail = null;
//             int size = 0;
    
//             // algo for adding  an element to the tail part of the Linked list 
//             public void addNode(int data){
//                 Node newNode = new Node(data);
//                 size++;
//                 // if element is going to be inserted/added/appended for the first time, then, 
//                 if(head == null){
//                     head = tail = newNode;
//                 }
//                 else {
    
//                     tail.next = newNode;
//                     tail = newNode;
    
//                 }
//             }
    
//             // alog --> how to add element on the left/front/head side of the linked list
//             public void addHeadFirst(int data){
    
//                 Node newNode = new Node(data);
//                 size++;
//                 newNode.next = head;
//                 head = newNode;
//             }
    
//             public void removeNode(Node node){
//                 Node current = head;
//                 size--;
//                 while(current.next != node){
//                     current = current.next;
//                 }
//                 current.next = node.next;
//             }
    
//             public void removeAtAnyPoint(int pos){
//                 Node current = head;
//                 size--;
//                 for(int i = 2; i < pos; i++){
//                     current = current.next;
//                 }
//                 current.next = current.next.next;
//             }
    
//             public int getDataAtAnyPos(int pos){
//                 Node current = head;
//                 for(int i = 1; i <= pos; i++){
//                     current = current.next;
//                 }
//                 return current.data;
//             }
    
//             public int getSize() {
//                 return size;
//             }
            
//             public void printLinkedList(){
//                 Node current = head;
//                 while(current != null){
//                     System.out.println(current.data);
//                     current = current.next;
//                 }
    
//             }
//         }
//     }
    
//     public static void main(String[] args){
//         GraphAdjList g = new GraphAdjList(5);
//         g.addEdge(0,1);
//         g.addEdge(0,2);
//         g.addEdge(1,3);
//         g.addEdge(1,2);
//         g.addEdge(4,3);
//         g.addEdge(4,2);
//     }
// }
