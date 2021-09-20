import java.util.*;
class Solution {
    public int solution(int N) {
       int result = 0;
        String str = Integer.toBinaryString(N);
        char[] ch = str.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '1') {
                arr.add(i);
            }
        }

        if(arr.size()>1){
            for(int i = 0; i < arr.size()-1; i++){
                int count = Math.abs(arr.get(i) - arr.get(i+1))-1;
                if(result < count){
                    result = count;
                }
            }
        }
        return result;
    }
}
