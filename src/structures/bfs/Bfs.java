package structures.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
	
	private int v=10;
	
	public void bfs(int s,int t){
		if (s==t) {
			return;
		}
		boolean[] visited=new boolean[v];
		visited[s]=true;
		Queue<Integer> queue=new LinkedList<>();
		queue.add(s);
		int[] prev=new int[v];
		for(int i=0;i<v;++i){
			prev[i]=-1;
		}
		while (queue.size() != 0) {
			int w = queue.poll();
			
		}
	}
	
	public static void main(String[] args) {
		

	}

}
