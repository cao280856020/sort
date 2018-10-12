package test.MyStack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	Queue queue;
	
	int top=0;
	
	public MyStack() {
	     queue=new LinkedList();   
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	queue.add(x);
    	top++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int t= (int)queue.peek();
    	top--;
    	queue.peek();
    	return t;
    }
    
    /** Get the top element. */
    public int top() {
    	if(queue.peek()==null){
    		return 0;
    	}
        return (int)queue.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return top==0;
    }
}
