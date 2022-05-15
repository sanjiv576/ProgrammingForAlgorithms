package stack;
// this is driver class for testing StackExample.java
public class Test {
    public static void main(String[] args){
        StackImplementation obj = new StackImplementation(5);
        obj.push(100);
        obj.push(200);
        obj.push(300);
        // System.out.println("After push operation : " + obj.stk);

        //
        System.out.println(obj.pop());
    }
}
