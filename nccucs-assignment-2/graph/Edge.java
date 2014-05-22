package ps3.graph;
import ps3.graph.WeightedNode;

class Edge{
	WeightedNode Begin;
	WeightedNode End;
	Edge(WeightedNode Begin , WeightedNode End){
		this.Begin = Begin;
		this.End = End;
	}
}