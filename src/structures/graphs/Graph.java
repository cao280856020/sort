package structures.graphs;

public class Graph {
	
	private final int MAX_VERTS=20;
	
	private Vertex vertexList[];//顶点存放
	
	private int adjMat[][];//邻接矩阵
	
	private int nVerts;
	
	private StackX theStack;
	
	private QueueX queueX;
	
	public Graph(){
		vertexList=new Vertex[MAX_VERTS];
		
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVerts=0;
		theStack=new StackX();
		queueX=new QueueX();
	}
	public void addVertex(char label){
		vertexList[nVerts++]=new Vertex(label);
	}
	public void addEdge(int start,int end){
		adjMat[start][end]=1;
		adjMat[end][start]=1;
	}
	public void displayVertex(int v){
		System.out.print(vertexList[v].label);
	}
	
	public int getAdjUnvisitedVertex(int v){
		for(int i=0;i<nVerts;i++){
			if(adjMat[v][i]==1 && vertexList[i].wasVisited==false){
				return i;
			}
		}
		return -1;
	}
	
	//depth first search
	public void dfs(){
		vertexList[0].wasVisited=true;
		this.displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty()){
			int v=getAdjUnvisitedVertex(theStack.peek());
			if(v==-1){
				theStack.pop();
			}else{
				vertexList[v].wasVisited=true;
				displayVertex(v);
				theStack.push(v);
			}
		}
		for(int i=0;i<nVerts;i++){
			vertexList[i].wasVisited=false;
		}
	}
	//breadth first search
	public void bfs(){
		vertexList[0].wasVisited=true;
		this.displayVertex(0);
		queueX.insert(0);
		int v2;
		while(!queueX.isEmpty()){
			int v1=queueX.remove();
			while((v2=getAdjUnvisitedVertex(v1))!=-1){
				vertexList[v2].wasVisited=true;
				this.displayVertex(v2);
				queueX.insert(v2);
			}
		}
		
		for(int i=0;i<nVerts;i++){
			vertexList[i].wasVisited=false;
		}
	}
	
	public void mst(){
		vertexList[0].wasVisited=true;
		theStack.push(0);
		while(!theStack.isEmpty()){
			int currentVertex=theStack.peek();
			int v=getAdjUnvisitedVertex(currentVertex);
			if(v==-1){
				theStack.pop();
			}else{
				vertexList[v].wasVisited=true;
				theStack.push(v);
				
				this.displayVertex(currentVertex);
				this.displayVertex(v);
				System.out.println();
			}
		}
		for(int i=0;i<nVerts;i++){
			vertexList[i].wasVisited=false;
		}
	}
}
