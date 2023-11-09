package AB;

import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidParantheses v = new ValidParantheses();
		
		boolean expected = false;
		System.out.println(expected == v.isValid("(]"));

	}
	
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i < s.length(); i++)
        {
            char item = s.charAt(i);

           switch(item){
            case ')':
                if(!stack.isEmpty() && stack.peek() == '('){
                stack.pop();
                }
                else{
                    return false;
                }
                break;
            case ']':
                if(!stack.isEmpty() && stack.peek() == '['){
                stack.pop();
                 }
                else{
                    return false;
                }
                break;
            case '}':
                if(!stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
                 }
                else{
                    return false;
                }
                break;
            default:
                stack.push(item);
                break;
           }
        }

        return stack.isEmpty();
    }

}
