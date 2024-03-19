import java.util.*;
class MyQueue {

    Stack<Integer> eq = new Stack<>();
    Stack<Integer> dq = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        eq.add(x);
    }
    
    public int pop() {
        if(!dq.isEmpty()){
            return dq.pop();
        }
        while(!eq.isEmpty()){
            dq.add(eq.pop());
        }
        return dq.pop();
    }
    
    public int peek() {
        if(!dq.isEmpty()){
            return dq.peek();
        }
        while(!eq.isEmpty()){
            dq.add(eq.pop());
        }
        return dq.peek();
    }
    
    public boolean empty() {
        return eq.isEmpty() && dq.isEmpty();
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
