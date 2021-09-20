class Solution {
    public int solution(int X, int Y, int D) {
      int result = 0;
        int extraSteps = (Y-X)%D;
        if(extraSteps == 0){
            result = (Y-X)/D;
        }
        else{
            result = ((Y-X)/D)+1;
        }
        return result;
    }
}
