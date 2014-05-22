package ps3.graph;
import ps3.graph.Graph;
import ps3.graph.WeightedNode;
import java.util.ArrayList;

public class NewGraph extends Graph{
	public String name;
	public ArrayList<WeightedNode> nodelist;
	public ArrayList<Edge> edgelist;
	
	NewGraph(String name){
		this.name = name;
	}
	void AddNode(WeightedNode nd){
		this.nodelist.add(nd);
	}
	void AddEdge(WeightedNode b,WeightedNode e){
		Edge newedge = new Edge(b,e);
		this.edgelist.add(newedge);
	}

}