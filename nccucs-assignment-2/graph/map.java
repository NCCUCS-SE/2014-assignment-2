package ps3.graph;
import ps3.graph.WeightedNode;

import java.util.ArrayList;

import ps3.graph.NewGraph;


public class map{
	public ArrayList<WeightedNode> node;
	public ArrayList<NewGraph> graph;
	public map(){
		
	}
	public void CreateNode(String n, int c){
		WeightedNode nd = new WeightedNode(n,c);
		node.add(nd);
	}
	public void CreateGraph(String n){
		NewGraph g = new NewGraph(n);
		System.out.println(g.name);
		graph.add(g);
	}
	public void AddNode(String g_n,String n_n){
		 NewGraph tempgraph = graph.get(graph.indexOf(g_n));
		 WeightedNode tempnode = node.get(node.indexOf(n_n));
		 tempgraph.AddNode(tempnode);
	}
	public void ListNode(String g_n){
		 NewGraph tempgraph = graph.get(graph.indexOf(g_n));
		 int size = tempgraph.nodelist.size();
		 for(int i=0;i<size;i++){
			 System.out.println(tempgraph.nodelist.get(i).name+" ");
		 }
		
	}
	public void AddEdge(String g_n , String b_n, String e_n){
		 NewGraph targetgp = graph.get(graph.indexOf(g_n));
		 WeightedNode beginnd = node.get(node.indexOf(b_n));
		 WeightedNode endnd = node.get(node.indexOf(e_n));
		 targetgp.AddEdge(beginnd, endnd);
	}
	public void ListChild(String g_n, String n_n){
		NewGraph targetgp = graph.get(graph.indexOf(g_n));
		WeightedNode tempnode = node.get(node.indexOf(n_n));
		int edgesize = targetgp.edgelist.size();
		for(int i=0;i>edgesize;i++){
			if(tempnode.name == targetgp.edgelist.get(i).Begin.name)
				System.out.println(targetgp.edgelist.get(i).End.name+" ");
		}
	}
}