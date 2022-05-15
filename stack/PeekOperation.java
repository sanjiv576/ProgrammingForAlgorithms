package stack;
// Peek operation example in the Stack
// Note: peek --> returns the element at the top of the stack or returns null in empty stack

class PeekOperation{
    int size;
    int top = -1;
    int stk[];

    PeekOperation(int size){
        stk = new int[size];
        this.size = size;
    }

    // push operation
    public boolean push(int data){
        if (isFull()){
            System.out.println("stack overflow");
            return false;
        }

        stk[++top] = data;
        return true;
    }

    // method for checking stack is full or not
    public boolean isFull(){
        return top == size-1;
    }

    // peek operatino --> returns top element of stack without removing it.
    public int peekOpera(){
        if(isEmpty()){
            return 0;
        }
        return stk[top];
    }

    // checking whether the stack is empty or not
    public boolean isEmpty(){
        return top == -1;
    }

    public void printStack(){
        for(int i = 0; i<=top; i++){
            System.out.print(stk[i] + " ");
        }
    }
}

class DriverClass {
    public static void main(String[] args){
        PeekOperation peekOperation = new PeekOperation(4);

        // adding elements in the stack
        peekOperation.push(300);
        peekOperation.push(400);
        peekOperation.push(500);
        peekOperation.push(600);

        System.out.println("After push operation");
        peekOperation.printStack();

        System.out.println("Peek operation ");
        System.out.println(peekOperation.peekOpera());

        System.out.println("After peek operation");
        peekOperation.printStack();




    }
}

