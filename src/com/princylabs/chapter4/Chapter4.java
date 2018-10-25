package com.princylabs.chapter4;

import java.util.HashSet;
import java.util.LinkedList;

public class Chapter4 {

    public void BFS(int v, Graph graph) {
        LinkedList<Integer> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(v);

        while(!nextToVisit.isEmpty()) {
            int node = nextToVisit.remove();
            visited.add(node);
            System.out.println("Visiting node " + node);
            for (int n : graph.adj(node)) {
                if(!visited.contains(n)) {
                    nextToVisit.add(n);
                }
            }
        }
    }
}
