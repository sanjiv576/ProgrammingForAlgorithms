package stack;
// this module calls the methods of StackExample.java
public class BalanceParenthesis {
    
    public boolean isBalanced(String exp){

        StackExample stk = new StackExample(exp.length());
        String openingBracket = "[{(";
        String closingBracket = "]})";

        for(int i = 0; i<exp.length(); i++){

            char bracket = exp.charAt(i);
            // creating opening brackets
            if(bracket == '[' || bracket == '{' || bracket == '('){

                stk.push(bracket);
            }

            else {

                int indx = closingBracket.indexOf(bracket);
                char openingBraces = openingBracket.charAt(indx);

                // if stack stk is empty --- added at last
                if(stk.isEmpty()){
                    return false;
                }

                // checking for imbalance parenthesis
                if(stk.pop() != openingBraces){
                    return false;
                }
            }
        }

        // if any char left in the stack in the end, which shows it is unbalance
        if(!(stk.isEmpty())) {
            return false;
        }

        return true;
    }
}
