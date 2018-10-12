package test.MyStack;

public class Test {

	public static void main(String[] args) {
		MyStack obj = new MyStack();
		obj.push(1);
		obj.push(2);
		System.out.println(obj.top());
		System.out.println(obj.pop());
		System.out.println(obj.empty());
	}

}
