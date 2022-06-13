public class DoublyImpl {
    public static class Node{
        Node prev, next;
        int data;

        Node(int data){
            this.data = data;
            this.prev = this.next = null;
        }
    }
    // creating pointers to move
    Node head = null;
    Node tail = null;
    // adding element to the tail
    public void append(int data){
        Node newNode = new Node(data);
        // if appending for the first time
        if (head == null){
            head = tail = newNode;  // all carry address
        }
        else {
            tail.next = newNode;  // store address of second element
            newNode.prev = tail; // store address of first in the prev of second element
            tail = newNode;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public void reomveAtAnyPoint(int pos){
        Node current = head;
        for(int i = 2; i <= pos; i++){
            current = current.next;
        }
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    public int getDataAtAnyPos(int pos){
        Node current = head;
        for(int i = 2; i <= pos; i++){
            current = current.next;
        }
        return current.data;
    }
    public void printDoubly(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ---> ");
            current = current.next;
        }
        System.out.println();

    }

    public static void main(String[] args){
        DoublyImpl list = new DoublyImpl();
        list.append(10);
        list.append(20);
        list.append(30);
        list.printDoubly();
    }
}
