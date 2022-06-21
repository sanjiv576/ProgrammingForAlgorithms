public class LinkedListImp {
    static class Node {

        // declaring data
        int data;

        // declaring address of the data
        // NOte: generally, next is prefered to create variable for storing address in Linked list
        Node next;

        Node(int data){
            this.data = data;
            // first off, address of the first element or head of the Linked list is null
            this.next = null;
        }
        
        
        Node head = null;
        Node tail = null;
        int size = 0;

        // algo for adding  an element to the tail part of the Linked list 
        public void append(int data){
            Node newNode = new Node(data);
            size++;
            // if element is going to be inserted/added/appended for the first time, then, 
            if(head == null){
                head = newNode;
                // head = newNode.next;
                // head.next = newNode;
            }
            else {

                // Node current = newNode;
                Node current = head;

                while(current.next != null){
                    current = current.next;
                }
                // head = current.next;
                current.next = newNode;

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
            for(int i = 1; i < pos; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }

        public int getDataAtAnyPos(int pos){
            Node current = head;
            for(int i = 2; i <= pos; i++){
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
                System.out.print(current.data + " ---> ");
                current = current.next;
            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        Node obj = new Node(30);
        obj.append(40);
        obj.append(50);
        obj.append(60);
        obj.append(70);
        obj.append(80);

        obj.addHeadFirst(100);
        obj.addHeadFirst(1);
        obj.append(1999);
        obj.printLinkedList();
        obj.removeAtAnyPoint(1);
        obj.printLinkedList();

        System.out.println("Data: " + obj.getDataAtAnyPos(5));


    }
}