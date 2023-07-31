import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine().split(" ")[1]);
        String[] nums = br.readLine().split(" ");
        int[] sums = new int[nums.length + 1];
        sums[0] = 0;
        for(int i = 0; i < nums.length; i++){
            sums[i + 1] = sums[i] + Integer.parseInt(nums[i]);
        }
        for(int i = 0; i < num; i++){
            String[] info = br.readLine().split(" ");
            bw.write(sums[Integer.parseInt(info[1])] - sums[Integer.parseInt(info[0]) - 1] + "\n");
        }
        bw.flush();
    }
}