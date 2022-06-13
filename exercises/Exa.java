import java.util.*;

public class Exa {
    int arr[];
    int size;
    int front;
    int rear;
    Exa(int size){
        this.size = size;
        arr = new int[size];
        rear = front = size;
    }
    public void fill(int data){
        if(rear == 0){
            System.out.println("Array overflows");
            return;
        }

        if(front == size){
            front = size-1;
        }

        arr[--rear] = data;
        
    }

    public void printArray(){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        Exa e = new Exa(4);
        e.fill(20);
        e.fill(30);
        e.fill(40);
        e.fill(50);

        e.printArray();
    }


}
