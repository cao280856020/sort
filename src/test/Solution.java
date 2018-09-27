package test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public void settingList(List<Integer> list,Node node){
		if(node!=null){
			Node parent=node;
			list.add(parent.val);
			if(node.children!=null){
				List<Node> nodeList=node.children;
				for(int i=0;i<nodeList.size();i++){
					settingList(list,nodeList.get(i));
				}
			}
		}
	}
	
	public List<Integer> preorder(Node root){
		List<Integer> list=new ArrayList<>();
		settingList(list,root);
		return list;
	}
	
	public void settingPostList(List<Integer> list,Node node,Node parent){
		if(node!=null){
			if(node.children!=null){
				List<Node> nodeList=node.children;
				parent=node;
				for(int i=0;i<nodeList.size();i++){
					settingPostList(list,nodeList.get(i),parent);
				}
				if(parent.val==node.val){
					list.add(node.val);
				}
			}else{
				list.add(node.val);
			}
		}
	}
	
	public List<Integer> postorder(Node root) {
		List<Integer> list=new ArrayList<>();
		settingPostList(list,root,root);
		return list;
    }
	
	public static void main(String[] a){
		Node node5=new Node(5,null);
		Node node6=new Node(6,null);
		List<Node> leftLastList=new ArrayList<>();
		leftLastList.add(node5);
		leftLastList.add(node6);
		
		List<Node> firstList=new ArrayList<>();
		Node node3=new Node(3,leftLastList);
		firstList.add(node3);
		Node node2=new Node(2,null);
		firstList.add(node2);
		Node node4=new Node(4,null);
		firstList.add(node4);
		
		Node root=new Node(1,firstList);
		
		Solution s=new Solution();
	//	s.preorder(root);
		s.postorder(root);
	}
}
