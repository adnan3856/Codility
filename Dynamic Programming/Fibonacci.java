import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {
    static Map<Integer,Long> memo = new HashMap<>();
    public static long Fibonacci(int n){
        if(memo.containsKey(n))
            return memo.get(n);
        if(n<=2)
            return 1;
        memo.put(n,Fibonacci(n-1) + Fibonacci(n-2));
        return memo.get(n);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(50));
        System.out.println(memo);
    }
}
