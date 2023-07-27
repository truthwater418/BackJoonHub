class Solution {

    public int solution(String[] spell, String[] dic) {
        for(String word : dic){
            int length = 0;
            for(String alpha : spell){
                if(word.contains(alpha)){
                    length++;
                }
            }
            if(length == spell.length){
                return 1;
            }
        }
        return 2;
    }
}