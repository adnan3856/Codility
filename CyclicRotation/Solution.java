class Solution {
    public int[] solution(int[] A, int K) {
        if(A.length > 0){
        for(int j=0;j<K;j++){
            int x = A[A.length-1];
            for(int i=A.length-1;i>0;i--){
                A[i] = A[i-1];
            }
            A[0] = x;
        }
        }
        return A;
    }
}
