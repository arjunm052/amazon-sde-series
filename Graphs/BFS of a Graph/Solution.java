/*
Given a directed graph. The task is to do 
Breadth First Traversal of this graph 
starting from 0.
*/

import java.util.*;

public class Solution {


    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] visited = new boolean[V];
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        while(q.size()>0){
            int rem = q.poll();
            
            if(visited[rem]){
                continue;
            }
            
            visited[rem] = true;
            res.add(rem);
            
            for(int x : adj.get(rem)){
                if(!visited[x]){
                    q.add(x);
                }
            }
        }
        
        return res;
    }

    
}
