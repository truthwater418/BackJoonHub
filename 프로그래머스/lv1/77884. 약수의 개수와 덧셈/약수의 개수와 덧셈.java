class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right; i++){
            double sqrt = Math.sqrt(i);
            if(sqrt == Math.floor(sqrt)){
                sum -= i;
            }else{
                sum += i;
            }
        }
        return sum;
    }
}