

public class BalanceBraces {
    
    // declaring char type stack
    char[] stk;

    // length/size of the stack
    int size;

    // indicating for empty stack
    int top = -1;

    BalanceBraces(int size){
        stk = new char[size];
        this.size = size;
    }

    public boolean push(char data){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }

        stk[++top] = data;
        return true;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public char pop(){
        if(isEmpty()){
            return 'f';
        }

        return stk[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

}

class CheckBalanceBraces{

    public boolean isBalanced(String exp){

        String openingBraces = "[{(";
        String closingBraces = "]})";

        BalanceBraces stk = new BalanceBraces(exp.length());

        for(int i = 0; i<exp.length(); i++){

            // taking each char of the string/exp
            char bracket = exp.charAt(i);
            

            // comparing the each bracket with opening braces , if true , insert it in the element
            if(bracket == '[' || bracket == '{' || bracket == '('){
                stk.push(bracket);
            }

            else {

                int indexBracket = closingBraces.indexOf(bracket);
                char openingBrac = openingBraces.charAt(indexBracket);


                if (stk.isEmpty()){
                    return false;
                }
                
                if(stk.pop() != openingBrac){
                    return false;
                }

                

            } 

            
        }

        if(!(stk.isEmpty())){
            return false;
        }

        return true;
    }

}


class Tester {
    public static void main(String[] args){

        String st = "[()}]";
        CheckBalanceBraces b = new CheckBalanceBraces();
        System.out.println(b.isBalanced(st));
    }
}
