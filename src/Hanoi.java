import java.util.*;

public class Hanoi {
    public String[] site = {"left","mid","right"};
    public ArrayList<String> getSolution(int n) {
        // write code here
        return Solution(n,0,2);
    }
    public ArrayList<String> Solution(int n,int from,int to){
        if (n==0){
            return new ArrayList<>();
        }
        ArrayList<String> list = Solution(n-1,from,3-from-to);
        list.add("move from "+site[from]+" to "+site[to]);
        list.addAll(Solution(n-1,3-from-to,to));
        return list;
    }
}