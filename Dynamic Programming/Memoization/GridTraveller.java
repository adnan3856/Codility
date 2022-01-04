import java.util.HashMap;
import java.util.Map;

public class GridTravller {
    static Map<String,Long> memo = new HashMap<>();
    public static long gridTravller(int m, int n){
        String key = m+","+n;
        if(memo.containsKey(key)) 
            return memo.get(key);
        
        if(m == 1 && n==1) 
            return 1;
        if(m==0 || n ==0) 
            return 0;
        memo.put(key, gridTravller(m-1,n) + gridTravller(m,n-1));
        
        return memo.get(key);
    }


    public static void main(String[] args) {
        System.out.println(gridTravller(18,18));
    }
}
