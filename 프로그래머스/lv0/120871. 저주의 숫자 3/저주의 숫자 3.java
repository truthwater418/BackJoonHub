class Solution {
    public int solution(int n) {
        int count = 0;
        int num = 0;
        while(count < n){
            num++;
            String str = String.valueOf(num);
            if(num % 3 != 0 && !str.contains("3")){
                count++;
            }
        }
        return num;
    }
}