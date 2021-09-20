class Solution {
    public int solution(int[] A) {
       int result = 0;
        long sumTotal = 0,sum=0;
        long n = A.length + 1;
        if(A.length > 1) {
            sumTotal = n * (n + 1) / 2;
//            System.out.println(sumTotal);
            for (int i = 0; i < A.length; i++) {
                sum = sum + A[i];
            }
//            System.out.println(sum);
            result = (int) Math.abs(sumTotal - sum);
        }
        else if(A.length == 1){
            result = A[0];
        }
        return result;
    }
}
