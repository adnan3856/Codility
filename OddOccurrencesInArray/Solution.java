class Solution {
    public static int solution(int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j])
                    count++;
            }
            if (count % 2 != 0)
                result = A[i];
        }
        return result;
    }
    }
