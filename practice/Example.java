public class Example {

    int[] queues;
    int size;
    int rear = -1;
    int front = -1;

    public Example(int  size){
        this.size = size;
        queues = new int[size];
    }

    public boolean enqueue(int data){
        if (isFull()){
            System.out.println("queue overflow");
            return false;
        }

        if(front == -1){
            front = 0;
        }

        queues[++rear] = data;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.print("queue is empty");
            return -1;
        }
        int val = front;
        if(rear == front){
            rear = front = -1;
        }
        else {
            front++;
        }
        return queues[val];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }

        return queues[front];
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return rear == size-1;
    }

    public void printQueue(){
        for(int i = 0; i <= rear; i++){
            System.out.print(queues[i] + " ==> ");
        }

        System.out.println();
    }

    public static void main(String[] args){

        Example ex = new Example(5);
        ex.enqueue(10);
        ex.enqueue(20);
        ex.enqueue(30);

        System.out.println(ex.peek());

        System.out.println(ex.dequeue());

        ex.printQueue();
    }

}