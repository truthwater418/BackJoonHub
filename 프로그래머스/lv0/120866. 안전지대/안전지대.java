class Solution {
    public int solution(int[][] board) {
        int mine = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    mine++;
                    int minX = j == 0 ? 0 : j - 1;
                    int minY = i == 0 ? 0 : i - 1;
                    int maxX = j == board[0].length - 1 ? j : j + 1;
                    int maxY = i == board.length - 1 ? i : i + 1;
                    for(int k = minY; k <= maxY; k++){
                        for(int m = minX; m <= maxX; m++){
                            int point = board[k][m];
                            if(point != 1 && point != 2){
                                board[k][m] = 2;
                                mine++;
                            }
                        }
                    }
                }
            }
        }
        return board.length * board[0].length - mine;
    }
}