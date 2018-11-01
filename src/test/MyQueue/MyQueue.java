package test.MyQueue;

import java.util.Stack;

class MyQueue {
	private Stack stackPush;
	
	private Stack statckPop;
	
	 /** Initialize your data structure here. */
    public MyQueue() {
        stackPush=new Stack();
        statckPop=new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackPush.add(x);
    }
    
    private void transfer(){
    	//空时，才去把数据给获取一下
    	if(statckPop.isEmpty()){
    		while(!stackPush.isEmpty()){
    			statckPop.add(stackPush.pop());
    		}
    	}
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
    	this.transfer();
    	if(statckPop.isEmpty()){
        	return -1;
        }else{
        	return (int) statckPop.pop();
        }
    }
    
    /** Get the front element. */
    public int peek() {
    	this.transfer();
        if(statckPop.isEmpty()){
        	return -1;
        }else{
        	return (int) statckPop.peek();
        }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(statckPop.isEmpty() && stackPush.isEmpty()){
        	return true;
        }else{
        	return false;
        }
    }
}
