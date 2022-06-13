// package GraphImplementation;

public class SinglyLinkList {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    Node tail = null;
    int size = 0;

    public void addNode(int data){
        size ++;
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }


    }
    public int getSize(){return size;}

    public int getDataAtAnyPos(int pos){
        Node current = head;
        for(int i = 1; i <=pos; i++){
            current = current.next;
        }
        return  current.data;
    }
    public static void main(String[] args){
        SinglyLinkList list = new SinglyLinkList();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        System.out.println(list.getDataAtAnyPos(1));
        list.getSize();
    }
}
