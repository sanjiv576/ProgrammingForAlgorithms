public class SinglyLInkedList {
    public static class Node {

        // declaring data
        int data;

        // declaring address of the data
        // NOte: generally, next is prefered to create variable for storing address in Linked list
        Node next;

        public Node(int data){
            this.data = data;
            // first off, address of the first element or head of the Linked list is null
            this.next = null;
        }
        
        
        Node head = null;
        Node tail = null;
        int size = 0;

        // algo for adding  an element to the tail part of the Linked list 
        public void addNode(int data){
            Node newNode = new Node(data);
            size++;
            // if element is going to be inserted/added/appended for the first time, then, 
            if(head == null){
                head = tail = newNode;
            }
            else {

                tail.next = newNode;
                tail = newNode;

            }
        }

        // alog --> how to add element on the left/front/head side of the linked list
        public void addHeadFirst(int data){

            Node newNode = new Node(data);
            size++;
            newNode.next = head;
            head = newNode;
        }

        public void removeNode(Node node){
            Node current = head;
            size--;
            while(current.next != node){
                current = current.next;
            }
            current.next = node.next;
        }

        public void removeAtAnyPoint(int pos){
            Node current = head;
            size--;
            for(int i = 2; i < pos; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }

        public int getDataAtAnyPos(int pos){
            Node current = head;
            for(int i = 1; i <= pos; i++){
                current = current.next;
            }
            return current.data;
        }

        public int getSize() {
            return size;
        }
        
        public void printLinkedList(){
            Node current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }

        }
    }
}
