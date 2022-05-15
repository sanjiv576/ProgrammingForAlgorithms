
// Practice: custom implementation of stack in java using int
public class StackImp {
    // declaring the stack in array
    int stk[];

    // size/ lenght of the stack
    int size;

    // indicating stack is empty
    int top = -1;

    StackImp(int size){
        // initilization the stack
        stk = new int[size];
        this.size = size;
    }

    // for push operation --> adding the element
    public boolean push(int data){

        // if stack is full then, stop inserting the data/element
        if(isFull()){
            System.out.println("stack overflow");
            return false;
        }

        // if stack is not full, then, increase top value by 1 and insert the data at the index of stack according to value of top
        stk[++top] = data;
        return true;
    }

    // checking the stack is full or not
    public boolean isFull(){
        // condition of full ---> top = length-1
        return top == size-1;
    }

    // for pop operation --> removing element
    public int pop(){
        // if stack is empty, then, stop removing the element
        if(isEmpty()){
            System.out.println("stack underflow");
            return -999999;
        }

        // if stack is not empty, then, reduce value of top by 1 and remove top element
        
        return stk[top--];
    }

    // checking stack is empty or not
    public boolean isEmpty(){
        return top == -1;
    }
    public void printStack(){
        for(int i = 0; i<=top; i++){
            System.out.print(stk[i] + " ");
        }
        System.out.println();
    }
}


class TestStackImp {
    public static void main(String[] args){
        StackImp obj = new StackImp(3);
        obj.push(400);
        obj.push(500);
        obj.push(600);

        System.out.println("After  push operation : ");
        obj.printStack();

        obj.pop();
        System.out.println("After pop operation");
        obj.printStack();
        
    }
}