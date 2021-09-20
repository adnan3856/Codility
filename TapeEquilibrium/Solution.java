class Solution {
    public int solution(int[] A) {
        int result =0;
    long sum = 0;
    for(int i=0; i<A.length; i++) {
      sum += A[i];
    }
    int diff1 = Integer.MAX_VALUE;
    int diff2 = Integer.MAX_VALUE;
    long sum1 = 0;
    long sum2 = 0;

    for(int p=0; p<A.length-1; p++) {
      sum1 += A[p];
      sum2 = sum - sum1;
      diff2 = (int) Math.abs(sum1 - sum2);
      diff1 = Math.min(diff2, diff1);
      result = diff1;
    }
    return result;
    }
}
