package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graphs {

    static class Edges {
        int source;
        int destination;

        Edges(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void createGraphs(ArrayList<Edges> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edges>();
        }

        graph[0].add(new Edges(0, 2));
        graph[1].add(new Edges(1, 2));
        graph[1].add(new Edges(1, 3));
        graph[2].add(new Edges(2, 0));
        graph[2].add(new Edges(2, 1));
        graph[2].add(new Edges(2, 3));
        graph[3].add(new Edges(3, 1));
        graph[3].add(new Edges(3, 2));
    }

    public static void main(String[] args) {

        ArrayList<Edges> graph[] = new ArrayList[5];
        boolean[] isVisited = new boolean[graph.length];
        Integer parent = null;

        createGraphs(graph);
        //dfs and all paths visited
     //   dfs(0, isVisited, graph, "0");
        for (int i = 0; i < graph.length; i++) {
            checkCyclic(0, parent, graph, isVisited);
        }

    }


    public static void dfs(int start, boolean[] isVisited, ArrayList<Edges> graph[], String path) {
        if(start==3){
            System.out.println(path);
        }
        if (!isVisited[start]) {
            for (int i = 0; i < graph[start].size(); i++) {
                isVisited[start] = Boolean.TRUE;
                dfs(graph[start].get(i).destination, isVisited, graph, path + graph[start].get(i).destination);
                isVisited[start] = Boolean.FALSE;
           }
        }
    }

    public static Boolean checkCyclic(int start, Integer parent, ArrayList<Edges> graph[], boolean[] isVisited) {
        isVisited[start] = Boolean.TRUE;
        for (int i = 0; i < graph[start].size(); i++) {
            if (!isVisited[graph[start].get(i).destination]) {
                checkCyclic(graph[start].get(i).destination, start, graph, isVisited);
            } else if (parent != graph[start].get(i).destination) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
