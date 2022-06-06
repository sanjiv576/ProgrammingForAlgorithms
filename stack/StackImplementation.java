// package stack;
// Exam ma aau cha
// Stack implementation 
public class StackImplementation {
    int stk[];
    int top = -1;  // incidating empty stack
    int size;

    // we define size in the constructor because we need to send the value of size while calling the class allocate memory at first
    StackImplementation(int size){

        stk = new int[size];
        // this --> indicates instance of the class
        this.size = size;
    }

    // since Stack is derived data structue of we create a mehtod
    public boolean push(int data){
        if(isFull()){
            System.out.println("Stack overflow");
            return false;
        }

        // now increasing top value
        top++;
        // inserting data in stack
        stk[top] = data;    // or we can use stk[++top] = data; but top++ must eliminate above;
        return true;
    }

    // for pop operation --- removing data
    public int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return 'f';
        }
        
        // int x = top;
        // top--;
        // return stk[x];
        // above  also works or 
        return stk[top--];
    }

    // before pop operation
    public boolean isEmpty(){
        return top == -1;
    }

    // before push operation, we always check stack is full or not
    public boolean isFull(){
        // checking stack full condition
        if (top == size-1){
            return true;
        }
        else{
            return false;
        }


        // return top == size-1;  // optimizing code 
    }

    public void printStack(){
        for(int i = 0; i<=top; i++){
            System.out.println(stk[i]);
        }
    }
}


// Driver class

// class StackExampleTest {
//     public static void main(String[] args){
//         StackImplementation obj = new StackImplementation(5);
//         obj.push(100);
//         obj.push(200);
//         obj.push(300);

//         System.out.println("After push operation : ");
//         obj.printStack();

//         obj.pop();
//         System.out.println("After pop operation : "); 
//         obj.printStack();
        
//     }
// }
