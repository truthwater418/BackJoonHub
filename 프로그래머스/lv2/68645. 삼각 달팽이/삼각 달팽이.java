class Solution {
    // 0 1 3 6 10 15
    // 20 14 9 5 2 
    public int[] solution(int n) {
        int total = n * (n + 1) / 2;
        int[] answer = new int[total];
        int index = 0;
        int term = 0;
        int vector = 0;
        int nextIndex = 0;
        for(int i = 1; i <= total; i++){
            if(vector % 3 == 0){
                nextIndex = index + term;
                term++;
            }else if (vector % 3 == 1){
                nextIndex = index + 1;
            }else if (vector % 3 == 2){
                nextIndex = index - term;
                term--;
            }
            if(nextIndex < 0 || nextIndex >= answer.length){
                i--;
                vector++;
                if(vector % 3 == 1){
                    term--;
                }else if(vector % 3 == 0){
                    term++;
                }
                continue;
            }
            if(answer[nextIndex] != 0){
                i--;
                vector++;
                if(vector % 3 == 1){
                    term--;
                }else if(vector % 3 == 0){
                    term++;
                }
                continue;
            }
            index = nextIndex;
            answer[index] = i;
        }
        return answer;
    }
}