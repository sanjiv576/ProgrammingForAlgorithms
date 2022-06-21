import java.util.*;
// Linear queue implementaion 
// Note: this question was asked in last exam
public class QueueExample {
    
    int queues[];
    // indicates last value of the queue
    int rear = -1;

    // indicates the initial/first value of the queue
    int front = -1;

    // length of the queue
    int size;

    QueueExample(int size){
        this.size = size;
        queues = new int[size];

    }

    public boolean enqueue(int data){

        // checking queue is full or not
        if(isFull()){
            System.out.println("queue overflow");
            return false;
        }

        // if we are inserting at first time in queue, we must insert in 0 index so 
        if(front == -1){
            front = 0;
        }

        // inserting data in the queue
        queues[++rear] = data;
        return true;

    }

    public int dequeue(){

        if(isEmpty()){
            System.out.println("queue underflow");
            return -999999;
        }

        // stroing value of front before resetting it
        int val = front;

        // this indicates we have only one element in the queue
        if(front == rear){
            // reset the value
            front = rear = -1;
        }
        else {
            // since front value is removed so front value increases by 1
            front++;
        }

        // returns front value of the queue to be deleted/removed/fetched
        return queues[val];
    }

    public boolean isFull(){
        // full queue condition
        return rear == size-1 ;
    }

    public boolean isEmpty(){
        // empty queue condition
        return front == -1;
    }

    public void printQueue(){
        System.out.println(Arrays.toString(queues));
    }

    public static void main(String[] args){
        QueueExample q = new QueueExample(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(90);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.printQueue();
        
    }


}
