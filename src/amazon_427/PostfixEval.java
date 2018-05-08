package amazon_427;

import java.util.Stack;

public class PostfixEval {

	public static void main(String[] args) 
    {
        String exp="231*+9-";
        System.out.println(evaluatePostfix(exp));
    }

	private static int evaluatePostfix(String exp) {
		
		//create a stack
        Stack<Integer> stack=new Stack<>();
		
        for(int i=0;i<exp.length();i++) {
        	char c=exp.charAt(i);
        	
        	
        	if(Character.isDigit(c))
                stack.push(c - '0');
        	else {
        		int val1 = stack.pop();
                int val2 = stack.pop();
        		switch(c) {
        		case '+':
        			stack.push(val1+val2);
        			break;
        		case '-':
        			stack.push(val1-val2);
        			break;
        		case '*':
            		stack.push(val1*val2);
            		break;
            	case '/':
                	stack.push(val1/val2);
               		break;	
        			
        		}
        	}
        	
        }
        return stack.pop();
	}
}
