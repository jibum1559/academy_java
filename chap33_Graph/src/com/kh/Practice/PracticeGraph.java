package com.kh.Practice;

import com.kh.GraphMain.Graph;

public class PracticeGraph {

	public static void main(String[] args) {
		PracticeGraph ph = new PracticeGraph();
//		ph.DFSPracticeMain();
		ph.DFSGraphPracticeMain();
	}
	public void DFSPracticeMain() {
		
		int ver = 10;
		Graph graph = new Graph(ver);
		
		graph.addEdge(0,1);
		graph.addEdge(0,4);
		graph.addEdge(4,2);
		graph.addEdge(2,3);
		graph.addEdge(3,5);
		
		System.out.println("DFS Å½»ö °á°ú : ");
		
		graph.DFS(0);
		
	}
	
	public void DFSGraphPracticeMain() {
		DFSGraph gr = new DFSGraph(8);
	
		gr.addEdge(0, 1);
		gr.addEdge(0, 2);
		gr.addEdge(1, 3);
		gr.addEdge(1, 4);
		gr.addEdge(2, 5);
		gr.addEdge(2, 6);
		gr.addEdge(3, 7);
		System.out.println("DFS Å½»ö °á°ú : ");
		gr.DFS(0);
		gr.DFS(1);
		gr.DFS(2);
		gr.DFS(3);
		gr.DFS(4);
		gr.DFS(5);
		gr.DFS(6);
		gr.DFS(7);
	}

	
}
