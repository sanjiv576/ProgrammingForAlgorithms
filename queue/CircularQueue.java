import java.util.Arrays;

public class CircularQueue {
    int rear = 1;
    int front = -1;
    int size;
    int[] queues;

    CircularQueue(int size){

        this.size = size;
        queues = new int[size];
    }

    public boolean enqueue(int data){
        if(isFull()){
            System.out.println("queue stackoveflow");
            return false;
        }

        if(front == -1){
            front = 0;
        }

        // moving rear towards
        rear = (rear+1) % size;
        queues[rear] = data;
        return true;

    }

    public int dequeue(){

        if(isEmpty()){
            System.out.println("queue undeflow");
            return 0;
        }

        // storing previous value of front
        int val = front;

        if(front == rear){
            front = rear = -1;
        }
        else {

            // moving the front towards
            front = (front+1) % size; 
        }

        return queues[val];
    }
    
    boolean isFull(){
        // full condition in circular queue
        return (rear+1)%size == front;
    }

    boolean isEmpty(){
        return front == -1;
    }

    public void printQueue(){
        System.out.println(Arrays.toString(queues));
    }

    // Note : Testing does not work properly
    public static void main(String[] args){
        CircularQueue q = new CircularQueue(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        // q.enqueue(50);
        // q.enqueue(60);

        // q.dequeue();
        q.printQueue();
        // q.enqueue(70);

        
        
    }
    
}
