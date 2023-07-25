class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;
        while(right < sequence.length && left < sequence.length){
            sum += sequence[right];
            while(sum > k){
                sum -= sequence[left];
                left++;
            }
            if(sum == k && length > (right - left)){
                answer[0] = left;
                answer[1] = right;
                length = right - left;
            }
            right++;
        }
      return answer;
    }
}