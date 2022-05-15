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
        for(int i = 0; i < queues.length; i++){
            System.out.println(queues[i]);
        }
    }

    // Note : Testing does not work properly
    public static void main(String[] args){
        CircularQueue q = new CircularQueue(4);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);

        // q.dequeue();
        q.printQueue();
        // q.enqueue(70);

        
        
    }
    
}
