package Model;

import java.util.Stack;

/**
 * Created by ostrouh on 15.05.2017.
 */
public class ReversePolishNotation {

    private final static String operators = "^*/+-";
    private static Stack<Character> stack = new Stack<Character>();
    public String prefixNotation;
    private String postfixNotation = createOutput();

    public ReversePolishNotation(String prefixNotation){
        this.prefixNotation = prefixNotation;
    }

    public String getPostfixNotation(){
        return postfixNotation;
    }

    private static int getPriority(Character ch) {
        if(ch == '^') {return 3;}

        else if(ch == '*' || ch == '/'){return 2;}

        else if(ch == '+' || ch == '-'){return 1;}

        else return -1;
    }

    private static boolean isOperator(Character op) {
        if(operators.contains(op.toString()))
        {
            return true;
        } else
            return false;
    }

    private String createOutput() {
        char[] inputArray = prefixNotation.toCharArray();

        String output = "";
        char temp;

        for(Character in: inputArray) {
            temp = '\0';
            //
            if(Character.isDigit(in) || in == '.') {
                output += in;
            }
            //

            else if(isOperator(in)) {
                if(stack.isEmpty()) {
                    stack.push(in);
                    output += " ";
                } else {
                    temp = stack.pop();
                    output += " ";

                    if (getPriority(in) > 0 && getPriority(in) > getPriority(temp)) {
                        stack.push(temp);
                        stack.push(in);
                    } else {
                        output += temp;
                        output += " ";
                        stack.push(in);
                    }
                    temp = '\0';
                }
            }
            //
            else if(in =='(') {
                stack.push(in);
            }
            //
            else if(in ==')') {
                while(true) {
                    temp = stack.pop();
                    if (temp == '(') {
                        break;
                    }else {
                        output += " ";
                        output += temp;
                        temp = '\0';
                    }
                }
            } else throw new IllegalArgumentException(prefixNotation);
        }
        while(true) {
            if(stack.isEmpty()) {
                break;
            } else {
                output += " ";
                output += stack.pop();
            }
        }
        return output;
    }
}
