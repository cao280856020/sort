package test.s705;

public class Solution {

	//[null,null,null,true,false,null,true,null,false]
	public static void main(String[] args) {
		MyHashSet obj = new MyHashSet();

		obj.add(1);
		
		obj.add(2);
		
		System.out.println(obj.contains(1));
		
		System.out.println(obj.contains(3));
		
		obj.add(2);
		
		System.out.println(obj.contains(2));
		
		obj.remove(2);
		
		System.out.println(obj.contains(2));
	}

}
