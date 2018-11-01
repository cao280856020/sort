package test.MyQueue;

import java.util.Stack;

class MyQueue2 {
	private Stack stack;
	private int head;
	private int tail;
    /** Initialize your data structure here. */
    public MyQueue2() {
    	head=0;
    	tail=0;
        stack=new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
        tail++;
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	return (int)stack.get(head++);
    }
    
    /** Get the front element. */
    public int peek() {
        return (int)stack.get(head);
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return head==tail;
    }
}
