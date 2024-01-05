
public class MinStack {

    public Stack<int> stack;
    public Stack<int> minStack;  
    public MinStack() {
        stack = new Stack<int>(); 
        minStack = new Stack<int>();
    }
    
    public void Push(int val) {
        stack.Push(val); 

        if(minStack.Count > 0) {
            int currMin = minStack.Peek();

            if(currMin < val) {
                minStack.Push(currMin); 
            }
            else {
                minStack.Push(val);
            }
        } else {
            minStack.Push(val);
        }
    }
    
    public void Pop() {
        if(stack.Count > 0) {
            stack.Pop();
        }
        if(minStack.Count > 0) {
            minStack.Pop();
        }
         
    }
    
    public int Top() {
        return stack.Peek();
    }
    
    public int GetMin() {
        return minStack.Peek();
    }
}
