import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T;
        T= Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum = 0;
            int group = Integer.parseInt(br.readLine());
            for(int i = 0; i < group; i++){
                String[] input = br.readLine().split(" ");
                sum += Integer.parseInt(input[1]) - Integer.parseInt(input[0]) + 1;
            }
            bw.write("#" + test_case + " " + sum + "\n");
            bw.flush();
        }
	}
}