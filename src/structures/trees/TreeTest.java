package structures.trees;

import structures.trees.Tree;

public class TreeTest {
	
	/*
	 *      5
	 *    2   6
	 *  1  3    10
	 *      4  8   15
	 *        7 9 12 16
	 *           11 
	 *         
	 */

	public static void main(String[] args) {
		Tree tree=new Tree();
		
		tree.insert(5);
		tree.insert(2); 
		tree.insert(6);
		tree.insert(1);
		tree.insert(3);
		tree.insert(4);
		tree.insert(10);
		tree.insert(8);
		tree.insert(7);
		tree.insert(9);
		tree.insert(15);
		tree.insert(12);
		tree.insert(16);
		tree.insert(11);
		
		System.out.println("iData is "+tree.find(11).key);
		
		tree.delete(12);
		
		tree.inOrder(tree.find(5));
	}

}
