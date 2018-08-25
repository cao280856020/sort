package structures.tree;

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
		
		tree.insert(5, 5);
		tree.insert(2, 2); 
		tree.insert(6, 6);
		tree.insert(1, 1);
		tree.insert(3, 3);
		tree.insert(4, 4);
		tree.insert(10, 10);
		tree.insert(8, 8);
		tree.insert(7, 7);
		tree.insert(9, 9);
		tree.insert(15, 15);
		tree.insert(12, 12);
		tree.insert(16, 16);
		tree.insert(11, 11);
		
		tree.delete(8);
		
//		System.out.println("getSuccessor is "+tree.getSuccessor(tree.find(10)).iData);

//		System.out.println("iData is "+tree.find(4).iData);
		
		tree.inOrder(tree.find(5));
		
		System.out.println();
		
		tree.preOrder(tree.find(5));
		
		System.out.println();
		
		tree.postOrder(tree.find(5));
		
		System.out.println();
		
//		System.out.println("minium is "+tree.minium().iData);
		
//		System.out.println("maxium is "+tree.maxium().iData);
	}

}
