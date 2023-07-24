import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T = Integer.parseInt(br.readLine());
        for(int i = 1; i <= T; i++){
            int N = Integer.parseInt(br.readLine());

            int[][] answer = new int[N][N];
            int x = 0, y = 0;
            int vector = 0;
            int times = N - 1;
            int index = 0;
            int c = 1;
            // 오 -> 아 -> 왼 -> 위
            //  x     y      x       y
            while(c <= N * N){
                answer[x][y] = c;
                if(index == times){
                    vector++;
                    index = 0;
                    if(vector % 2 == 1){
                        times--;
                    }
                }else{
                    index++;
                }
                if(vector % 4 == 0){
                    y++;
                }else if(vector % 4 == 1){
                    x++;
                }else if(vector % 4 == 2){
                    y--;
                }else if(vector % 4 == 3){
                    x--;
                }
                c++;
            }
            System.out.println("#" + i);
            for(int[] a : answer){
                for(int b : a){
                    System.out.print(b + " ");
                }
                System.out.println("");
            }
        }
    }
}