import java.util.*;

public class solution
{
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        boolean[] vis = new boolean[V];
        vis[0] = true;
        ArrayList<Integer> res = new ArrayList<>();
        dfsUtil(0, vis, adj,res);
        return res;
    }
    
    public static void dfsUtil(int src, boolean[] visited, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res){
        visited[src] = true;
        res.add(src);
        
         for(int i: adj.get(src)){
             if(!visited[i]){
                 dfsUtil(i,visited,adj,res);
             }
         }
    }

    public static void main(String[] args) {
        
    }
}