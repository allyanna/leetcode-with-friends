public class Solution {
    public int EvalRPN(string[] tokens) {
        var stack = new Stack<int>(); 

        foreach(string c in tokens) {
            if(c is "*" || c is "+" || c is "-" || c is "/") {
                int y = stack.Pop(); 
                int x = stack.Pop(); 

                if(c == "+") stack.Push(x + y);
                else if(c == "/") stack.Push(x / y);
                else if(c == "*") stack.Push(x * y);
                else stack.Push(x - y);

            }else {
                int numVal = Int32.Parse(c);
                stack.Push(numVal); 
            }
        }

        return stack.Pop();
    }
}
