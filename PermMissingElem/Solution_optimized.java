class Solution { 
  public int solution(int[] A) {  
    int ans =0,j=1;  
    for(int i=0 ; i<A.length ; i++,j++){  
      ans = ans^A[i]^j;  
    }  
    ans = ans^(A.length+1);  
    return a;
  }
}
