import java.util.HashMap;

public class LRUCaching {
    // declaring HashMap
    HashMap<Integer, Node> map;

    // creating
    int capacity;

    public static class Node {
        // for hashmap
        int key;
        int value;

        // for double linked list
        Node prev, next;

        // creating constructor
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    LRUCaching(int capacity) {
        this.capacity = capacity;

        // creating map
        map = new HashMap<>();
    }

    // defining put function
    public void put(int key, int value) {
        // checking w
        if (map.containsKey(key)) {
            // remove the node remove(map.get(key));

            removeNode(map.get(key));

        } else if (map.size() == capacity) {

            removeNode(tail);

        } else {
            // insert new Node in the head
            Node newNode = new Node(key, value);
            insert(newNode);
        }
    }

    // for linking front and tail parts
    Node head = null;
    Node tail = null;

    public void insert(Node node) {
        // inserting key and address of the data(not the value) in the Hashmap
        map.put(node.key, node);

        // inserting for the first time
        if (head == null) {
            head = tail = null;
        } else {
            // adding the element in the head (left) side
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public int get(int key) {
        // provide key
        Node node = map.get(key);

        //
        if (node == null) {

            return 0;
        }
        removeNode(node);
        // remove(node) and insert to the top ----> recently used data that present in
        // the memory
        insert(node);
        return node.value;
    }

    // removing
    public void removeNode(Node node) {

        // removing from the hashmap
        map.remove(node.key);

        // this is head, removing it
        if (node == head) {
            // removing it
            head = head.next;
            // null the nex value of the head
            node.next = null;
            // null the prev value of the new head
            head.prev = null;
        } else if (node == tail) {
            // chaning tail
            tail = tail.prev;

            // nulling the next value new tail
            tail.next = null;

            // nulling the prev value of previous tail
            node.prev = null;
        }

        else {

            // removing any node between head and tail
            //
            node.prev.next = node.next;

            // changing
            node.next.prev = node.prev;

            node.prev = null;
            node.next = null;

        }
    }

}
