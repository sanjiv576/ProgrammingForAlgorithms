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

        // algo for adding  an element to the tail part of the Linked list 
        public void append(int data){
            Node newNode = new Node(data);

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
            newNode.next = head;
            head = newNode;
        }
        public void printLinkedList(){
            Node current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }

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
        obj.printLinkedList();
    }
}