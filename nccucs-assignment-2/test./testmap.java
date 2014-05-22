package ps3.test;
import ps3.graph.*;

public class testmap {
	public static void main(String args[]) {
		testmap tp = new testmap();
		System.out.println("HelloWorld\n");
	}
	public testmap() {
		map mp = new map();
		String Agrp = "Graph1";
		String fstnd = "firstnode";
		String sndnd = "secondnode";
		
		mp.CreateGraph(Agrp);
		mp.CreateNode(fstnd, 10);
		mp.CreateNode(sndnd, 50);
		mp.AddNode(Agrp,fstnd);
		mp.AddNode(Agrp, sndnd);
		mp.AddEdge(Agrp, fstnd, sndnd);
		mp.ListChild(Agrp, sndnd);
		mp.ListNode(Agrp);
	}
}